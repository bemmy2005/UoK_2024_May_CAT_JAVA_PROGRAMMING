//gatali igena irenee

package question1;
import java.util.Scanner;
public class Temperature {



			public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);
				System.out.print("Enter the number of temperatures: ");
				int numT = scanner.nextInt();

				// Create arrays to store 
				double[] temperatures = new double[numT];
				double[] convertedTemperatures = new double[numT];

				char choice;
					System.out.println("Enter temperature unit you want to convert:");
					System.out.println("1. Fahrenheit");
					System.out.println("2. Celsius");
					System.out.print("Your choice: ");
					int unitChoice = scanner.nextInt();

					// Prompt the user to input temperatures
					for (int i = 0; i <= numT-1; i++) {
						if (unitChoice == 1) {
							System.out.print("Enter temperature " + (i + 1) + " in Fahrenheit: ");
							temperatures[i] = scanner.nextDouble();
						} else if (unitChoice == 2) {
							System.out.print("Enter temperature " + (i + 1) + " in Celsius: ");
							temperatures[i] = (scanner.nextDouble() * 9 / 5) + 32;
						} else {
							System.out.println("Invalid choice! Please enter 1 for Fahrenheit or 2 for Celsius.");
							break;
						}}

					// Convert temperatures below teperature to fahrenhrit
					for (int j = 0; j <= numT-1; j++) {
						if (temperatures[j] < 0) {
							convertedTemperatures[j] = (temperatures[j]* 9/5) +32;
						} else {
							convertedTemperatures[j] = temperatures[j];
							// Leave temperatures above freezing as they are
						}}

					// Display the converted temperatures
					System.out.println("\nConverted temperatures are:");
					for (int k = 0; k <= numT-1; k++) {
						System.out.println("Temperature " + (k + 1) + ": " + convertedTemperatures[k] + " Celsius");
					}

				
					choice = scanner.next().charAt(0);  
				}
			

	
	

	}


