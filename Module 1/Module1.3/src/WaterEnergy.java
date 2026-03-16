import java.util.Scanner;

public class WaterEnergy {

    public static void main(String[] args) {

        // Create scanner for user input
        Scanner input = new Scanner(System.in);

        // Variables for water mass, temperatures, and energy
        double waterMass;
        double initialTemperature;
        double finalTemperature;
        double energy;

        // Welcome message
        System.out.println("Water Heating Energy Calculator");

        // Get water mass from user
        System.out.print("Enter the amount of water in kilograms: ");
        waterMass = input.nextDouble();

        // Get initial temperature
        System.out.print("Enter the initial temperature in Celsius: ");
        initialTemperature = input.nextDouble();

        // Get final temperature
        System.out.print("Enter the final temperature in Celsius: ");
        finalTemperature = input.nextDouble();

        // Calculate energy using Q = m * (Tf - Ti) * 4184
        energy = waterMass * (finalTemperature - initialTemperature) * 4184;

        // Display the result
        System.out.println("The energy needed is " + energy + " joules.");

        // Close the scanner
        input.close();
    }
}