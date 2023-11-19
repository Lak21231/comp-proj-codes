
import java.util.*;
public class Project28
{
    public static void main(String[] args)
    {
        //Declaration
        Scanner obj = new Scanner(System.in);
        int a[] = new int[123];
        int pos, end, start, mid, n, year, temp;
        
        //Accepting the year of graduation of the user
        System.out.println(" Please input the year of graduation: ");
        year = obj.nextInt();
        
        //Initialising the value of n 
        n = 1900;
        end = a.length - 1;
        start = 0; 
        mid = 1; 
        temp = -1; 
        
        //Initialising the elements of the array
        for(int x = 0; x<a.length; x++)
        {
            a[x] = n; 
            n++; 
        }
        
        //Using Binary Search
        for(int x = 0; x<a.length - 1; x++)
        {
            for(int y = 0; y<a.length - x - 1; y++)
            {
                mid = (start + end)/2;
                
                if(year == a[mid])
                {
                    temp = 1;
                    pos = mid; 
                    break; 
                }
                else if(year < a[mid])
                {
                    end = mid - 1;
                }
                else if(year > a[mid])
                {
                    start = mid + 1;
                }
            }
        }
        
        //Printing output
        System.out.println(" OUTPUT :");
        if(temp == 1)
        {
            System.out.println(" Record exists! ");
        }
        else
        {
            System.out.println(" Record does not exist ");
        }
    }
}