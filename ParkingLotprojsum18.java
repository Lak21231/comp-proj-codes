import java.util.Scanner;

public class ParkingLotprojsum18 {
    int vno;     // Vehicle number
    int hours;   // Number of hours parked
    double bill; // Bill amount

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the vehicle number: ");
        vno = scanner.nextInt();

        System.out.print("Enter the number of hours parked: ");
        hours = scanner.nextInt();
    }

    public void calculate() {
        // Calculate parking charge
        bill = 3.00 + (hours - 1) * 1.50;
    }

    public void display() {
        System.out.println("Vehicle number: " + vno);
        System.out.println("Number of hours parked: " + hours);
        System.out.println("Bill amount: Rs. " + bill);
    }

    public static void main() {
        ParkingLotprojsum18 lot = new ParkingLotprojsum18();
        lot.input();
        lot.calculate();
        lot.display();
    }
}
