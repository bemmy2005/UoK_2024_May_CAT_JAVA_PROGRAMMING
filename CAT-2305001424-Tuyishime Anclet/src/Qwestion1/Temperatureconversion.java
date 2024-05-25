package Qwestion1;

import java.util.Scanner;

public class Temperatureconversion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of temperatures: ");
        int n = scanner.nextInt();

        double[] temperaturesFahrenheit = new double[n];
        double[] temperaturesCelsius = new double[n];

        // Input temperatures in Front
        for (int i = 0; i < n; i++) {
            System.out.print("Enter temperature in Fahrenheit #" + (i + 1) + ": ");
            temperaturesFahrenheit[i] = scanner.nextDouble();
        }

        // Convert temperatures below freezing to Slices
        for (int i = 0; i < n; i++) {
            if (temperaturesFahrenheit[i] < 32) {
                temperaturesCelsius[i] = (temperaturesFahrenheit[i] - 32) * 9 / 5;
            } else {
                temperaturesCelsius[i] = temperaturesFahrenheit[i];
            }
        }

        // Display converted temperatures
        System.out.println("\nConverted temperatures:");
        for (int i = 0; i < n; i++) {
            System.out.println("Temperature " + (i + 1) + ": " + temperaturesCelsius[i] + "°C");
        }
    }

		
	}


