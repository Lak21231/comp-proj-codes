import java.util.Scanner;

public class projsum16 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Generate and print letters from A to Z with Unicode values");
            System.out.println("2. Display the pattern");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    printLettersWithUnicode();
                    break;
                case 2:
                    printPattern();
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

    // Function to print letters from A to Z with Unicode values
    public static void printLettersWithUnicode() {
        System.out.println("Letters        Unicode");
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.println("     " + c + "                    " + (int) c);
        }
    }

    // Function to display the specified pattern
    public static void printPattern() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}