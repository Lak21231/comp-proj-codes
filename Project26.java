
import java.util.*;
public class Project26
{
    public static void main(String[] args)
    {
        //Declaration
        Scanner obj = new Scanner(System.in); 
        double Largestno, Smallestno; 
        double range;
        int pos1, pos2; 
        

        //Initialisation
        double a[] = new double[15];
        Largestno = 0;
        Smallestno = a.length - 1; 
        
        //Accepting the arrray elements
        System.out.println(" Please enter the array elements: ");
        for(int x = 0; x<a.length; x++)
        {
            a[x] = obj.nextInt();
        }
        
        //Finding the largest number 
        for(int x = 0; x<a.length; x++)
        {
            {
                Largestno = a[x]; 
                pos1 = x;
            }
        }
        
        //Finding the smallest number 
        for(int x = 0; x<a.length; x++)
        {
            if(a[x] < Smallestno)
            {
                Smallestno = a[x]; 
                pos2 = x;
            }
        }
        
        //Calculating the range
        range = Largestno - Smallestno; 
        
        //Output
        System.out.println();
        System.out.println(" THE OUTPUT: ");
        System.out.println(" The Largest element of the array = "+Largestno);
        System.out.println(" The Smallest element of the array = "+Smallestno);
        System.out.println(" The range of the array = "+range);
    }
}