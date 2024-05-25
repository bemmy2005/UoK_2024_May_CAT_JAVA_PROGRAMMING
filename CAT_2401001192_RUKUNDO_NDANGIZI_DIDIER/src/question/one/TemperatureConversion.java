//RUKUNDO NDANGIZI DIDIER

package question.one;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      //Prompt the user to input the numbers of temperature
        System.out.println("Enter the number of temperatures:");
        int numberOfTemperatures = scanner.nextInt();

        double[] fahrenheitTemperatures = new double[numberOfTemperatures];
        double[] convertedTemperatures = new double[numberOfTemperatures];

        System.out.println("Enter temperatures in Fahrenheit:");
        for (int i = 0; i < numberOfTemperatures; i++) {
            System.out.print("Temperature " + (i + 1) + ": ");
            fahrenheitTemperatures[i] = scanner.nextDouble();
        }

        char conversionChoice;
        do {
            System.out.println("Enter the conversion unit (F for Fahrenheit or C for Celsius):");
            conversionChoice = scanner.next().toUpperCase().charAt(0);
        } while (conversionChoice != 'F' && conversionChoice != 'C');

        for (int i = 0; i < numberOfTemperatures; i++) {
            if (conversionChoice == 'C' && fahrenheitTemperatures[i] < 32) {
         
                convertedTemperatures[i] = (fahrenheitTemperatures[i] - 32) * 5 / 9;
            } else {
          
                convertedTemperatures[i] = fahrenheitTemperatures[i];
            }
        }
        
        //Stored Converted Temperatures

        System.out.println("Converted temperatures:");
        for (int i = 0; i < numberOfTemperatures; i++) {
            System.out.println("Temperature " + (i + 1) + ": " + convertedTemperatures[i] + "°" + conversionChoice);
        }

        scanner.close();
    }

}
