 import java.util.*;
public class program7
{
    public static void main()
    {
        Scanner obj= new Scanner(System.in);
        System.out.println("Input the length of paper rolls");
        int l= obj.nextInt();
        System.out.println("Input the the cost per meter of paper");
        int cost = obj.nextInt();
        System.out.println("Input D for dealer and R for retailer");
        char check= obj.next().charAt(0);
        double amount=0;
        double total_cost= 0;
        switch(check)
        {
            case 'D':
            case 'd': System.out.println("You have chosen Dealer");
                      if(l <=10)
                      {
                          amount= l*cost;
                          total_cost= amount- amount*0.1;
                          System.out.println("Cost is calculated after discount");
                          System.out.println("Details:");
                          System.out.println("Length is = "+l);
                          System.out.println("Cost per meter = "+cost);
                          System.out.println("Amount= "+amount);
                          System.out.println("Total cost after discount= "+total_cost);
                      }
                      else if(l>10&&l<=20)
                      {
                          amount= l*cost;
                          total_cost= amount- (10*cost*0.1) - ( (l-10)*cost*0.15);
                          //System.out.println("Cost is calculated after discount"); 
                          System.out.println("Cost is calculated after discount");
                          System.out.println("Details:");
                          System.out.println("Length is = "+l);
                          System.out.println("Cost per meter = "+cost);
                          System.out.println("Amount= "+amount);
                          System.out.println("Total cost after discount= "+total_cost);
                      }
                      else
                      {
                          amount= l*cost;
                          total_cost= amount- (10*cost*0.1) - (10*cost*0.15)-( (l-20)*cost*0.20);
                          //System.out.println("Cost is calculated after discount"); 
                          System.out.println("Cost is calculated after discount");
                          System.out.println("Details:");
                          System.out.println("Length is = "+l);
                          System.out.println("Cost per meter = "+cost);
                          System.out.println("Amount= "+amount);
                          System.out.println("Total cost after discount= "+total_cost);
                      }
                      break;
            case 'R':
            case 'r': System.out.println("You have chosen Retailer");
                      if(l <=10)
                      {
                          amount= l*cost;
                          total_cost= amount- amount*0.08;
                          //System.out.println("Cost is calculated after discount");
                          System.out.println("Cost is calculated after discount");
                          System.out.println("Details:");
                          System.out.println("Length is = "+l);
                          System.out.println("Cost per meter = "+cost);
                          System.out.println("Amount= "+amount);
                          System.out.println("Total cost after discount= "+total_cost);
                      }
                      else if(l>10&&l<=20)
                      {
                          amount= l*cost;
                          total_cost= amount- (10*cost*0.08) - ( (l-10)*cost*0.1);
                          //System.out.println("Cost is calculated after discount"); 
                          System.out.println("Cost is calculated after discount");
                          System.out.println("Details:");
                          System.out.println("Length is = "+l);
                          System.out.println("Cost per meter = "+cost);
                          System.out.println("Amount= "+amount);
                          System.out.println("Total cost after discount= "+total_cost);
                      }
                      else
                      {
                          amount= l*cost;
                          total_cost= amount- (10*cost*0.08) - (10*cost*0.1)-( (l-20)*cost*0.15);
                          //System.out.println("Cost is calculated after discount"); 
                          System.out.println("Cost is calculated after discount");
                          System.out.println("Details:");
                          System.out.println("Length is = "+l);
                          System.out.println("Cost per meter = "+cost);
                          System.out.println("Amount= "+amount);
                          System.out.println("Total cost after discount= "+total_cost);
                      }   
                      break;
                      
            default : System.out.println("Invalid Input");
        }
        
        
    }
}