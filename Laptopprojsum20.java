import java.util.Scanner;

public class Laptopprojsum20
{
    double amt, dis;
    String name;
    long price;
    Laptopprojsum20(long p, String n)
    {
        name = n;
        price = p;
    }
    void calculate()
    {
        if (price <= 25000)
        {
            dis = 5.0 / 100.0;
        }
        else if (price <= 50000)
        {
            dis = 7.5 / 100.0;
        }
        else if (price <= 100000)
        {
            dis = 10.0 / 100.0;
        }
        else
        {
            dis = 15.0 / 100.0;
        }
        amt = price - (price * dis);
    }

    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Price: ₹" + price);
        System.out.println("Discount: " + dis * 100 + "%");
        System.out.println("Amount: ₹" + amt);
    }

    public static void main()
    {
        Scanner inpt = new Scanner(System.in);
        System.out.println("Enter your name");
        String n = inpt.nextLine();
        System.out.println("Enter the price of the laptop");
        long p = inpt.nextLong();

        Laptopprojsum20 obj = new Laptopprojsum20(p, n);
        obj.calculate();
        obj.display();
    }
}
