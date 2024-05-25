//Nhial Luka Deng-239000417

package question_One;

import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);


		System.out.print("Enter the number of temperatures: ");
		int Temp = scanner.nextInt();


		double[] fahrenheitTemp = new double[Temp];


		for (int i = 0; i < Temp; i++) {
			System.out.print("Enter temperature " + (i + 1) + " in Fahrenheit: ");
			fahrenheitTemp[i] = scanner.nextDouble();
		}


		double[] celsiusTemp = new double[Temp];


		for (int i = 0; i < Temp; i++) {
			double fahrenheit = fahrenheitTemp[i];
			double celsius = (fahrenheit - 32) * 5 / 9;
			celsiusTemp[i] = celsius;


			if (fahrenheit < 32) {
				System.out.println("Temperature " + (i + 1) + " is below freezing.");
			}
		}


		System.out.println("\nConverted temperatures (Celsius):");
		for (int i = 0; i < Temp; i++) {
			System.out.println("Temperature " + (i + 1) + ": " + celsiusTemp[i] + "°C");
		}

		char choice;
		do {
			System.out.print("\nEnter 'F' for Fahrenheit or 'C' for Celsius: ");
			choice = scanner.next().charAt(0);
		} while (choice != 'F' && choice != 'C');

		if (choice == 'F') {

			System.out.println("\nOriginal temperatures (Fahrenheit):");
			for (int i = 0; i < Temp; i++) {
				System.out.println("Temperature " + (i + 1) + ": " + fahrenheitTemp[i] + "°F");
			}
		}
	}
}