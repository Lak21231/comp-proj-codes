import java.util.Scanner;
public class program8
{
    public static void  main()
    {
        Scanner obj= new Scanner(System.in);
        System.out.println("Input t for Term Deposit and r for Recurring Deposit");
        char ch= obj.next().charAt(0);
        double mv= 0;
        switch(ch)
        {
            case 't':
            case 'T':
                System.out.println("You have chosen Term Deposit");
                System.out.println("Input the Principal ");
                double p = obj.nextDouble();
                System.out.println("Input the rate of interest ");
                double r = obj.nextDouble();
                System.out.println("Input the time period in years ");
                double n = obj.nextDouble();
                System.out.println("Maturity value will be calculated");
                mv= p*Math.pow((1+(r/100)),n);
                System.out.println("Maturity value= "+mv);
                break;
                
            case 'r':
            case 'R':
                double numerator= 0;
                double denominator = 0;
                System.out.println("You have chosen Recurring Deposit");
                System.out.println("Input the Monthly Installment ");
                double i = obj.nextDouble();
                System.out.println("Input the rate of interest ");
                double rate = obj.nextDouble();
                System.out.println("Input the time period in months ");
                double num = obj.nextDouble();
                System.out.println("Maturity value will be calculated");
                //mv= i*(num+i)*((num*(num+1))/2)*(rate/100)*(1/12);
                numerator= i *(num + i) * (num*(num+1))*rate;
                denominator = 2 *100 * 12;
                mv = numerator / denominator;
                System.out.println("Maturity value= "+mv);
                break;
                
            default: System.out.println("Invalid Input");
        }
    }
}