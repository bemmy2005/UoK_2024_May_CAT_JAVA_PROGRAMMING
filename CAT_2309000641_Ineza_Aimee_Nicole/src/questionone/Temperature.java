//INEZA Aimee Nicole
package questionone;
import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of temperatures: ");
        int n = scanner.nextInt();

        double[] temperaturesFahrenheit = new double[n];
        double[] convertedTemperaturesCelsius = new double[n];

       
        for (int i = 0; i < n; i++) {
            System.out.print("Enter temperature in Fahrenheit #" + (i + 1) + ": ");
            temperaturesFahrenheit[i] = scanner.nextDouble();
        }

        
        for (int i = 0; i < n; i++) {
            if (temperaturesFahrenheit[i] < 32) {
                convertedTemperaturesCelsius[i] = (temperaturesFahrenheit[i] - 32) * 5 / 9;
            } else {
                convertedTemperaturesCelsius[i] = temperaturesFahrenheit[i];
            }
        }

       
        System.out.println("Converted temperatures:");
        for (int i = 0; i < n; i++) {
            System.out.println("Temperature #" + (i + 1) + ": " + convertedTemperaturesCelsius[i] + " °C");
        }

        scanner.close();
    }
}