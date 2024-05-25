//AYITO Marie Guyse Laure
package question.one;

import java.util.Scanner;

public class Temperature {
	


	public static void main(String[] args) {
		//Declaration
	
		double numTemps;
		double convertedTemps;
		
		//Enter the value from the user 
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of temperature you want to convert");
		numTemps=input.nextDouble();
		double[][]temFarhenheit;
		double[][]temCelsius;
		
		//Display in form of the list the different temperature
		for(double i=0;i<numTemps;i++){
			double[][] numTemps;
			System.out.println(numTemps[(int)i]);
		 
			//Check the condition before displaying the result
			
			if(numTemps<0){
				convertedTemps=((9/5)*numTemps[i]+32);
				System.out.println("The result is"+convertedTemps);
				
				
			}else{
				System.out.print("Try again");
				
			}
			do{
			System.out.println("Choose the original temperature");
			System.out.println("Choose the target temperature");
			
			String Celsius;
			String Fahenreit;
			while("C" == Celsius && "F" == Fahenreit){
				System.out.print()
			}
	}
			}
	
	}
		
		



