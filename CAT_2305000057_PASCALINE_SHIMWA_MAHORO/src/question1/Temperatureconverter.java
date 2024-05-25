//Pascaline Shimwa 2305000057
package question1;

import java.util.Scanner;

public class Temperatureconverter {

	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the number of temperatures: ");
	        int n = scanner.nextInt();
	        
	        double[] fahrenheitTemps = new double[n];//I have removed 3 and inserted n
	        double[] convertedTemps = new double[n];
	        
	        
	        System.out.println("Enter the temperatures in Fahrenheit:");
	        for (int i = 0; i < n; i++) {
	            System.out.print("Temperature " + (i + 1) + ": ");
	            fahrenheitTemps[i] = scanner.nextDouble();
	        }
	        
	        
	        char choice;
	        
	        
	        do {
	            System.out.print("Convert to (F)ahrenheit or (C)elsius? Enter F or C: ");
	            choice = scanner.next().toUpperCase().charAt(0);
	        } while (choice != 'F' && choice != 'C');
	        
	        
	        for (int i = 0; i < n; i++) {
	            if (choice == 'C') {
	                if (fahrenheitTemps[i] < 32) {
	                    // This is to convert to celsius if below freezing
	                    convertedTemps[i] = (fahrenheitTemps[i] - 32) * 5 / 9;
	                } else {
	                    convertedTemps[i] = fahrenheitTemps[i]; // Here is to Keep as Fahrenheit if the above statement doesn't work
	                }
	            } else {
	                // If the user  the choice is Fahrenheit then we should  keep the original temperatures
	                convertedTemps[i] = fahrenheitTemps[i];
	            }
	        }
	        
	        
	        System.out.println("Converted temperatures:");
	        for (int i = 0; i < n; i++) {
	            if (choice == 'C' && fahrenheitTemps[i] < 32) {
	                System.out.println("Temperature"+i + 1+ fahrenheitTemps[i]+convertedTemps[i]);
	            } else {
	                System.out.println("Temperature "+ i + 1+fahrenheitTemps[i]);
	            }
	        }
	        
	      
	    }
	}
	        
	        

