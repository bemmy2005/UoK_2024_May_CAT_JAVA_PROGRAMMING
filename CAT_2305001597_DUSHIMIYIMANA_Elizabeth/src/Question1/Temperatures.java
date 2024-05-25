package Question1;

import java.util.Scanner;



public class Temperatures {
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
	
	        System.out.println("Enter the number of temperatures: ");
	       
	        int temperatures = 0;
			double[] farhneits = new double[temperatures];

	        for (temperatures=0;temperatures<temperatures;temperatures++) {
	            System.out.println("Enter temperatures in Fahrenheit "+temperatures);
	            farhneits[temperatures] = input.nextDouble();
	        }

	       
	        char conversionUnit;
	        do {
	            System.out.println("Enter C to change farhneit to celcius: ");
	            conversionUnit = input.next().toUpperCase().charAt(0);
	        } while (conversionUnit != 'C');
	        
	        double[] celcius = new double[temperatures];
	        for (temperatures=0;temperatures<temperatures;temperatures++) {
	        	if(farhneits[temperatures]<32){
	        	double fahrenheit=farhneits[temperatures];
	            double celsius = (fahrenheit+32)*9/5;
	        	
	            celcius[temperatures] = celsius;}
	        }

	        
	}

}
