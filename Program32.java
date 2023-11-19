
import java.util.*;
public class Program32
{
    public static void main(String[] args)
    {
        //Declaration
        Scanner obj = new Scanner(System.in);
        String key;
        int temp, index;
        
        //Initialisating the arrays
        String wonder[] = {"Chicken Itza", "Christ the Redeemer", "Taj Mahal", "Macchu Picchu", "Petra", "Colosseum"};
        String country[] = {"Mexico", "Brazil", "India", "China", "Peru", "Jordan", "Italy"};
        
        //Accepting the value of key
        System.out.println(" Please input the country to be searched from the array: ");
        key = obj.nextLine();
        
        //Initialisation
        temp = -1;
        index = 0;
        
        //Using Linear Search
        for(int x = 0; x<country.length; x++)
        {
            if(key.compareTo(country[x]) == 0)
            {
                temp = 1;
                index = x; 
            }
        }
        
        //Output
        System.out.println(" THE OUTPUT: ");
        if(temp == 1)
        {
            System.out.println(" Country: "+key);
            System.out.println(key+ " - "+wonder[index]);
        }
        else
        {
            System.out.println(" Sorry Not Found! ");
        }
     } 
}


    
 
