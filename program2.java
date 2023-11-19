import java.util.*;
public class program2
{
    public static void main()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Program to check if the number is a Composite number or not");
        System.out.println("Input the number to be checked");
        int num = obj.nextInt();
        int c = 0;
        for(int i= 2; i<num; i++)
        {
            if(num%i==0)
            {
                c=1; 
            }
        }
        if (c==1)
        {
            System.out.println(num+" is a Composite number"); 
        }
        else
        {
            System.out.println(num+" is not a Composite number");
        }
    }
}