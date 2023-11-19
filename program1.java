import java.util.*;
public class program1
{
    public static void main()
    {
        Scanner obj= new Scanner(System.in);
        System.out.println("Program to check if the number is a special number or not");
        //System.out.println("A number is said to specialif the sum of the factorial of the digits is equal to the original number");
        System.out.println("Input the number to be checked");
        int check= obj.nextInt();
        int temp = check; 
        int num = check;
        int sum = 0;
        while (check>0)
        {
            temp = check%10;
            int pro = 1;
            for(int i = 1; i<=temp; i++)
            {
                pro= pro*i;
                
            }
            //System.out.println(pro);
            sum += pro;
            check = check/10;
        }
        //System.out.println(sum);
        if(sum == num)
        {
            System.out.println(num+" is a special number");
        }
        else
        {
            System.out.println(num+" is not a special number");
        }
    }
}