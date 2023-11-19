import java.util.Scanner;
public class projsum11a 
{
    public static void main() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        double x = scanner.nextDouble();
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        double sum = 0;
        double term = 1;
        for (int i = 1; i <= n; i++) {
            term *= (-1); // Alternate terms have opposite signs
            term *= x / factorial(i); // Calculate the next term
            sum += term; // Add the term to the sum
        }
        System.out.println("The sum of the series is: " + sum);
    }   
    // Function to calculate the factorial of a number
    public static double factorial(int num) {
        double fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}