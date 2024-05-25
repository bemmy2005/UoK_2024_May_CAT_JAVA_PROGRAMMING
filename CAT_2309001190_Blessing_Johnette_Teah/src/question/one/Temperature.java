package question.one;

import java.util.Scanner;

public class Temperature {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numTemp;
		int i;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of temperature you want to convert");
		numTemp =input.nextInt();
		
		double [] tempCelsius = new double[numTemp];
		double [] convertedTemp = new double[numTemp];
		
		System.out.println("Enter the temperature in Celsius");
		for(i =0; i< numTemp; i++)
		{
			
			System.out.println("Temperature "+ (i + 1));
			tempCelsius[i] =input.nextDouble();
			
		}
		String choice;
		do{
			System.out.println(" Choose the conversion (F for Fahrenheit or C for Celsius");
			choice = input.next().toUpperCase();
			break;
		}while(!choice.equals(" F") && !choice.equals("C"));
		
		for(i=0; i< numTemp; i++)
		{
			if(tempCelsius[i] < 0)
			{
				convertedTemp[i] =((9/5) * tempCelsius[i])+32;
			}else
			{
				System.out.println("I can convert temperature above freezing point");
				convertedTemp[i] =tempCelsius[i];
				
				
			}
		}
		for(i =0; i<numTemp; i++)
		{
			if(choice.equals("C"))
			{
				System.out.println(" The conversion of celsius: " + tempCelsius[i]+ "Converted temperature " + convertedTemp[i]);
			}else
			{
				System.out.println("This cannot be converted");
			}
		}

	}

}
