/**
 * Drew Crockett
 * Course: CSD-402
 * Module: 4.2
 */

public class Crockett_Mod4_CSD402 {

    public static void main(String[] args) {

        // Arrays of different sizes and types
        short[] shortArray = {5, 10, 15};
        int[] intArray = {10, 20, 30, 40};
        long[] longArray = {100L, 200L, 300L, 400L, 500L};
        double[] doubleArray = {2.5, 3.5, 4.5, 5.5, 6.5, 7.5};

        // Display results
        displayShortArray(shortArray);
        System.out.println("Average: " + average(shortArray));
        System.out.println();

        displayIntArray(intArray);
        System.out.println("Average: " + average(intArray));
        System.out.println();

        displayLongArray(longArray);
        System.out.println("Average: " + average(longArray));
        System.out.println();

        displayDoubleArray(doubleArray);
        System.out.println("Average: " + average(doubleArray));
    }

    // Overloaded average methods

    public static short average(short[] array) {
        int sum = 0;
        for (short num : array) {
            sum += num;
        }
        return (short) (sum / array.length);
    }

    public static int average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static long average(long[] array) {
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Display methods

    public static void displayShortArray(short[] array) {
        System.out.print("Short Array: ");
        for (short num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void displayIntArray(int[] array) {
        System.out.print("Int Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void displayLongArray(long[] array) {
        System.out.print("Long Array: ");
        for (long num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void displayDoubleArray(double[] array) {
        System.out.print("Double Array: ");
        for (double num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
