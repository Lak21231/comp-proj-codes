
import java.util.*;
public class Project22
{
    public void series(int x, int n)
    {
        //Declaration 
        Scanner obj = new Scanner(System.in); 
        double s;
        double term; 
        
        //Initialisation 
        s = 0;
        
        //Computation
        for(int a = 0; a<=n; a++)
        {
            term = Math.pow(x,a);
            s+=term; 
        }
        
        //Output
        System.out.println(" The sum of the series = "+s);
    }
    
    public void series(int p)
    {
        //Declaration
        Scanner obj = new Scanner(System.in);
        int term; 
        
        //Computation and Output
        System.out.println(" The series: ");
        for(int x = 1; x<=p; x++)
        {
            term = (int) Math.pow(x,3) - 1;
            System.out.print(term+ " ");
        }
    }
        
    public void series()
    {
        //Declaration
        Scanner obj = new Scanner(System.in);
        int sum, term;
        
        //Initialisation
        sum = 0;
        
        //Computation
        for(int x = 2; x<=10; x++)
        {
            term = 1/x; 
            sum+= term; 
        }
        
        //Output
        System.out.println(" The sum of the series = "+sum);
    }
}