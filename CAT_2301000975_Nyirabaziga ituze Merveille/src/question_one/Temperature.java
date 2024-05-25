//Nyirabaziga ituze Merveille


package question_one;

import java.util.Scanner;

public class Temperature {

	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number of temperature");
		int numTemperature=scanner.nextInt();
		
		double[] temperaturesFahrenheit = new double[numTemperature];
		double[]temperaturecelsius=new double[numTemperature];
	
		//Input temperature in fahrenheit
		
		for (int i = 0; i < numTemperature; i++) {
 System.out.print("Enter temperature in Fahrenheit: ");
	          temperaturesFahrenheit[i] = scanner.nextDouble();
		}
		 // Convert temperatures below freezing to Celsius
		for(int i=0;i<numTemperature;i++){
			if(temperaturesFahrenheit[i]<32){
				 temperaturecelsius[i] = (temperaturesFahrenheit[i] +32) * 5 / 9;
	          } else {
	        	  temperaturecelsius[i] = temperaturesFahrenheit[i];
	          }
			
	          }
		//output converted temperature
		
	        	  System.out.println("\ntemperature");
	        	  for(int i=0;i<numTemperature;i++){
	        		  System.out.println(temperaturesFahrenheit[i]+"F="+temperaturecelsius[i]+"0c");
	        	  }
	        	  
	        	  
	          }
			}
		


