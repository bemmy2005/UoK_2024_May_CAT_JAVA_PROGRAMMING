package questionone;

import java.util.Scanner;

	public class Temperatureconverter {

		  public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Enter the number of temperatures: ");
		        int n = scanner.nextInt();
		        double[] fahrenheitTemps = new double[n];
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
		        for(int i=0;i<n;i++){
		        	 if (choice == 'C') {
			                if (fahrenheitTemps[i] < 0) {
			                    
			                    convertedTemps[i] = (fahrenheitTemps[i] + 32)*9/5 ;
			                } else {
			                    convertedTemps[i] = fahrenheitTemps[i]; 
			                }
		 	        System.out.println("Converted temperatures:");
		 	        for (int i1 = 0; i1 < n; i1++) {
		 	            if (choice == 'C' && fahrenheitTemps[i1] < 32) {
		 	                System.out.printf("Temperature %d: %.2f�F -> %.2f�C%n"+ i1 + 1+""+ fahrenheitTemps[i1], convertedTemps[i1]);
		 	            } else {
		 	                System.out.println("Temperature %d: %.2f�F%n", i1 + 1, fahrenheitTemps[i1]);
		 	            }
		 	        }
		        	 }
		        }
		  }
	}
		 	        
		 	      
		 	    
		 	
		        

