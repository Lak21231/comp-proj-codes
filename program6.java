import java.util.*;
public class program6
{
    public static void main()
    {
        Scanner obj= new Scanner (System.in);
        System.out.println("Input the number of hours worked by an employee in a week");
        int hours = obj.nextInt();
        double wages = 0;
        if(hours<=48)
        {
            wages= hours *1000;
        }
        else if(hours>48&&hours<=56)
        {
            wages = 48000+ (hours-48)*1250;
        }
        else
        {
            wages = 48000+10000+ (hours-56)*1500;
        }
        System.out.println("Hours worked by the employee="+hours);
        System.out.println("Total weekly wages of the employee= "+wages);
    }
}