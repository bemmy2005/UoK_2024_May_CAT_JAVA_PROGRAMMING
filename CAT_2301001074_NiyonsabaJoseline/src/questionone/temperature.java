package questionone;

import java.util.Scanner;

public class temperature {

	/**
	 * @param args
	 */
	//Niyonsaba Joseline
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of temperatures: ");
	        int n = scanner.nextInt();

	        double[] temperaturesFahrenheit = new double[n];
	        double[] temperaturesCelsius = new double[n];

	     
	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter temperature in celicius " + (i + 1) + ": ");
	            temperaturesCelsius[i] = scanner.nextDouble();
	        }
	        for (int i = 0; i < n; i++) {
	            if (temperaturesFahrenheit[i] <0) {
	                temperaturesFahrenheit[i] = ((9/5)*(temperaturesCelsius+32));
	            } else {
	                temperaturesFahrenheit[i] = temperaturesCelsius[i];
	            }
	        }
	        for (int i = 0; i < n; i++) {
	            System.out.println("Temperature " + (i + 1) + ": " + temperaturesFahrenheit[i]
	            		);
	        }
	    }
	}




