import java.util.Scanner;

public class WaterEnergy {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double waterMass;
        double initialTemperature;
        double finalTemperature;
        double energy;

        System.out.println("Water Heating Energy Calculator");

        System.out.print("Enter the amount of water in kilograms: ");
        waterMass = input.nextDouble();

        System.out.print("Enter the initial temperature in Celsius: ");
        initialTemperature = input.nextDouble();

        System.out.print("Enter the final temperature in Celsius: ");
        finalTemperature = input.nextDouble();

        energy = waterMass * (finalTemperature - initialTemperature) * 4184;

        System.out.println("The energy needed is " + energy + " joules.");

        input.close();
    }
}