public class projsum13 {
    public static void main() {
        int rows = 5;

        for (int i = rows; i >= 1; i--) {
            char currentChar = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(currentChar + "   ");
                currentChar++;
            }
            System.out.println();
        }
    }
}