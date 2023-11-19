import java.util.Scanner;

public class projsum11b {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        double x = scanner.nextDouble();

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        double sum = 0.0;
        double term = 2.0; // First term of the series

        for (int i = 1; i <= n; i++) {
            sum += term;
            term *= (2 * i + 1) / x; // Calculate the next term
        }

        System.out.println("The sum of the series is: " + sum);
    }
}