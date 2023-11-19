public class projsum14 {
    public static void main() {
        int n = 5;

        for (int i = n; i >= 1; i--) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print numbers in decreasing order
            for (int k = 1; k <= i; k++) {
                System.out.print(i);
            }

            System.out.println();
        }
    }
}