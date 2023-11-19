import java.util.Scanner;

public class projsum15 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose a pattern:");
            System.out.println("1. Pattern 1");
            System.out.println("2. Pattern 2");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    printPattern1();
                    break;
                case 2:
                    printPattern2();
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please select 1, 2, or 3.");
            }
        }
    }

    // Function to print Pattern 1
    public static void printPattern1() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                if (j < i) {
                    System.out.print("   #   ");
                }
            }
            System.out.println();
        }
    }

    // Function to print Pattern 2
    public static void printPattern2() {
        int num = 1;
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + "   ");
                num++;
            }
            System.out.println();
        }
    }
}
