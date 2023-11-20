import java.util.Scanner;

public class problem_21 {

    // Function to generate Fibonacci series up to a given value
    static void generate(int n) {
        int first = 0, second = 1;
        System.out.println("Fibonacci Series up to " + n + " terms:");

        while (first <= n) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }

    // Function to generate prime numbers between two values
    static void generate(int start, int end) {
        System.out.println("Prime numbers between " + start + " and " + end + ":");

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Function to check if a number is prime
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main() {
        Scanner scanner = new Scanner(System.in);

        // Option to choose operation
        System.out.println("Choose operation:");
        System.out.println("1. Generate Fibonacci series");
        System.out.println("2. Generate Prime numbers");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the value for Fibonacci series:");
                int fibValue = scanner.nextInt();
                generate(fibValue);
                break;
            case 2:
                System.out.println("Enter the range for prime numbers (start end):");
                int startRange = scanner.nextInt();
                int endRange = scanner.nextInt();
                generate(startRange, endRange);
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }
}
