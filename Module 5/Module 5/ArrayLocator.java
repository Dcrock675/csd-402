
/**
 * Drew Crockett
 * Module 5.2
 * 2/7/26
 */
public class ArrayLocator {

    public static int[] locateLargest(double[][] arrayParam) {
        int row = 0;
        int col = 0;
        double max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        return new int[] {row, col};
    }

    public static int[] locateLargest(int[][] arrayParam) {
        int row = 0;
        int col = 0;
        int max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        return new int[] {row, col};
    }

    public static int[] locateSmallest(double[][] arrayParam) {
        int row = 0;
        int col = 0;
        double min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        return new int[] {row, col};
    }

    public static int[] locateSmallest(int[][] arrayParam) {
        int row = 0;
        int col = 0;
        int min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        return new int[] {row, col};
    }

    // Test method for BlueJ
    public static void test() {
        double[][] testDouble = {
            {1.2, 3.4, 2.2},
            {5.1, 0.5, 3.3},
            {2.1, 4.2, 1.1}
        };

        int[][] testInt = {
            {1, 3, 2},
            {5, 0, 3},
            {2, 4, 1}
        };

        int[] largestDouble = locateLargest(testDouble);
        int[] smallestDouble = locateSmallest(testDouble);
        int[] largestInt = locateLargest(testInt);
        int[] smallestInt = locateSmallest(testInt);

        System.out.println("Largest double at: [" + largestDouble[0] + ", " + largestDouble[1] + "]");
        System.out.println("Smallest double at: [" + smallestDouble[0] + ", " + smallestDouble[1] + "]");
        System.out.println("Largest int at: [" + largestInt[0] + ", " + largestInt[1] + "]");
        System.out.println("Smallest int at: [" + smallestInt[0] + ", " + smallestInt[1] + "]");
    }
}
