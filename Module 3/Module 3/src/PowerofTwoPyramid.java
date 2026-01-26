

public class PowerofTwoPyramid {

    public static void main(String[] args) {

        int rows = 7;

        for (int i = 0; i < rows; i++) {

            // Print leading spaces
            for (int s = rows - i - 1; s > 0; s--) {
                System.out.print("  ");
            }

            // Increasing powers of 2
            int value = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                value *= 2;
            }

            // Decreasing powers of 2
            value /= 2;  // undo last doubling
            for (int j = 0; j < i; j++) {
                value /= 2;
                System.out.print(value + " ");
            }

            // End line with @ symbol
            System.out.println("@");
        }
    }
}