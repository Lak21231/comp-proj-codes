import java.util.*;
import java.io.*;
public class program5
{
    public static void main()
    {
        Scanner obj= new Scanner (System.in);
        System.out.println("Input the ten digit number to be checked");;
        
        String isbn= obj.nextLine();
        System.out.println(isbn.length());
        if (isbn.length() != 10)
        
        {
            System.out.println("Illegal ISBNN");
            
        }
        else
        {
            int num=Integer.valueOf(isbn);
            int count=0;
            int multiply=1;
            int check= 0;
            for(int z=1; z<=10; z++)
            {
                num= num%10;
                count+= 1;
                check= multiply*num;
                num= num/10;
            }
            if(check%11 == 0)
            {
                System.out.println("Legal ISBN");
            }
            else
            {
                System.out.println("Ilegal ISBN");
            }
        }
    }
}