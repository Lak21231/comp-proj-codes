import java.util.*;
public class program10
{
    public static void main()
    {
        Scanner obj= new Scanner(System.in);
        System.out.println("Input a for pattern 1 or b for pattern 2");
        char ch= obj.next().charAt(0);
        switch(ch)
        {
            case 'a':
            case 'A': System.out.println("You have chosen pattern 1");
                      System.out.println("Input the desired number");
                      int a = obj.nextInt();
                      int num = 1;
                      //System.out.println(num);
                      for(int i = 1; i<=a ; i++)
                      {
                          for(int j=1; j<=i; j++)
                          {
                              System.out.print(j);
                          }
                          System.out.print(" ");
                      }
                      break;
            case 'b':
            case 'B': System.out.println("You have chosen pattern 2");
                      System.out.println("Input the desired number");
                      int b = obj.nextInt();
                      double sum= 0;
                      double multi = 1;
                      int count =1;
                      double result = 0;
                      for(int i = 1; i<=b ; i++)
                      {
                               sum= 0;
                              multi = 1;
                          for(int j=1; j<=i; j++)
                          {
   
                              sum = sum+j;
                              multi = multi*j;
                              //System.out.println(sum);
                              //System.out.println(multi);
                          }
                          result = result+ (sum/multi);
                          //System.out.println("the divided value is" + sum/multi);
                      }
                      System.out.println("The sum of the series is ="+ result);
                      break;
            default: System.out.println("Please try again later");
                      break;
                      
        }
    }
}