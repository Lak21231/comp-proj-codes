public class projsum12 {
    public static void main() {
        int n = 5; // Change this value to adjust the number of rows

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print("0   ");
                } else {
                    System.out.print("1   ");
                }
            }
            System.out.println(); // Move to the next line for the next row
        }
    }
}