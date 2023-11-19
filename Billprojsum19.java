import java.util.Scanner;

public class Billprojsum19
{
    int bno, call;
    String name;
    double amt;

    Billprojsum19()
    {
        bno = 0;
        call = 0;
        name = "";
        amt = 0.0;
    }
    Billprojsum19(int b, int c, String n)
    {
        bno = b;
        call = c;
        name = n;
    }
    void calculate ()
    {
        int rc = 125;
        amt = 0.0;
        double prt1 = 100 * 0.60;
        double prt2 = 100 * 0.80;
        double prt3 = 100 * 1.20;

        if (call <= 100)
        {
            amt += (rc + (call * 0.60));
        }
        else if (call > 100 && call <= 200)
        {
            amt += (rc + prt1 + ((call - 100) * 0.80));
        }
        else if (call > 200 && call <= 300)
        {
            amt += (rc + prt1 + prt2 + ((call - 200) * 1.20));
        }
        else if (call > 300)
        {
            amt += (rc + prt1 + prt2 + prt3 + ((call - 300) * 2.00));
        }
    }
    void display ()
    {
        System.out.println("Bill Number: " + bno);
        System.out.println("Name: " + name);
        System.out.println("Number of calls: " + call);
        System.out.println("Amount: ₹" + amt);
    }

    public static void main()
    {
        Scanner inpt = new Scanner(System.in);
        System.out.println("Enter the bill number");
        int b = inpt.nextInt();
        System.out.println("Enter your name");
        String n = inpt.next();
        System.out.println("Enter the number of calls");
        int c = inpt.nextInt();

        Billprojsum19 obj = new Billprojsum19();
        Billprojsum19 obj2 = new Billprojsum19(b, c, n);
        obj2.calculate();
        obj2.display();
    }
}
