import java.util.Scanner;

public class ElectricBillprojsum17 {
    String n;     // Name of the customer
    int units;    // Number of units consumed
    double bill;  // Amount to be paid

    public void accept() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the customer: ");
        n = scanner.nextLine();

        System.out.print("Enter the number of units consumed: ");
        units = scanner.nextInt();
    }

    public void calculate() {
        if (units <= 100) {
            bill = units * 2.00;
        } else if (units <= 300) {
            bill = 100 * 2.00 + (units - 100) * 3.00;
        } else {
            bill = 100 * 2.00 + 200 * 3.00 + (units - 300) * 5.00;
            double surcharge = bill * 0.025; // 2.5% surcharge
            bill += surcharge;
        }
    }

    public void print() {
        System.out.println("Name of the customer: " + n);
        System.out.println("Number of units consumed: " + units);
        System.out.println("Bill amount: " + bill);
    }

    public static void main() {
        ElectricBillprojsum17 billObj = new ElectricBillprojsum17();
        billObj.accept();
        billObj.calculate();
        billObj.print();
    }
}