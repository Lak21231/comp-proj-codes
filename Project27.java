
import java.util.*;
public class Project27
{
    public static void main(String[] args)
    {
        //Declaration
        Scanner obj = new Scanner(System.in);
        int a[] = new int[10];
        int index, temp, key; 
        
        //Accepting the values of the array
        System.out.println(" Please input the elements of the array: ");
        for(int x = 0; x<a.length; x++)
        {
            a[x] = obj.nextInt();
        }
        
        //Accepting the value of key
        System.out.println(" Please input the value to be searched from the array: ");
        key = obj.nextInt();
        
        //Initialisation
        temp = -1;
        index = 0;
        
        //Using Linear Search
        for(int x = 0; x<a.length; x++)
        {
            if(key == a[x])
            {
                temp = 1;
                index = x; 
            }
        }
        
        //Checking if key is found and printing output
        System.out.println();
        System.out.println(" OUTPUT: ");
        if(temp == 1)
        {
            System.out.println(" Search Successful! ");
            System.out.println(key+ " is found in the array at index "+index);
        }
        else
        {
            System.out.println(" Not found in the list, search unsuccessful");
        }
    }
}