
import java.util.*;
public class Program31
{
    public static void main(String[] args)
    {
        //Declaration
        Scanner obj = new Scanner(System.in); 
        String a[] = new String[10];
        int pos; 
        
        //Accepting the values of array elements
        System.out.println(" Please input the names: ");
        for(int x = 0; x<a.length; x++)
        {
            a[x] = obj.nextLine();
        }
        
        //Printing the unsorted array
        System.out.println(" THE UNSORTED ARRAY: ");
        for(int x = 0; x<a.length; x++)
        {
            System.out.print(a[x]+ " ");
        }
        
        //Using Bubble Sort
        for(int x = 0; x<a.length - 1; x++)
        {
            for(int y = 0; y<a.length - x - 1; y++)
            {
                if(a[y].compareTo(a[y+1]) > 0)
                {
                    String temp = a[y];
                    a[y] = a[y+1];
                    a[y+1] = temp;
                }
            }
            System.out.println();
        }
        
        //Printing the sorted array
        System.out.println(" THE SORTED ARRAY ");
        for(int x = 0; x<a.length; x++)
        {
            System.out.print(a[x]+ " ");
        }
    }
}