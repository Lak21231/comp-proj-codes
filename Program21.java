
import java.util.*;
public class Program21
{
    public void generate()
    {
         //Declaration
         Scanner obj = new Scanner(System.in);
         int n, term1, term2, term3;
         
         //Accepting the value of n
         System.out.println(" Please input the total number of Fibonacci numbers needed: ");
         n = obj.nextInt();
         
         //Initilaisation
         term1 = 0; 
         term2 = 1;
         
         //Printing the fibonacci numbers
         System.out.println(" The Fibonacci numbers: ");
         for(int x = 0; x<=n; x++)
         {
             System.out.println(term1+ " ");
             
             //Swapping values
             term3 = term1 + term2; 
             term2 = term3;
             term1 = term3; 
         }
    }
    
    public void generate(int a, int b)
    {
        
    }
}