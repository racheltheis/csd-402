//Rachel Theis
// CSD 402
//1.12.24
//Module 1 Programming Assignment

//This program will calculate the energy needed to heat water from an initial point to a final point using user input

import java.util.Scanner;

public class HeatEnergyCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the mass of water in kilograms: ");
        double waterMass = scanner.nextDouble();

        System.out.print("Enter the initial temperature in Celsius: ");
        double initialTemperature = scanner.nextDouble();

        System.out.print("Enter the final temperature in Celsius: ");
        double finalTemperature = scanner.nextDouble();

        double Q = waterMass * (finalTemperature - initialTemperature) * 4184;

        System.out.println("The amount of heat energy required is: " + Q + " joules");

        scanner.close();
    }
}