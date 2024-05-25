package question1;

import java.util.Scanner;

public class Temrerature_celcius {
	public class Converting_to_celcius {

		
		public void main(String[] args) {
			
			int temperatures, i;
			
			
	        Scanner input = new Scanner(System.in);
	        System.out.println("Enter the number of temperatureseratures: ");
	        temperatures = input.nextInt();
	        double[] farhneits = new double[temperatures];

	        // Input temperatureseratures
	        for (i=0;i<temperatures;i++) {
	            System.out.println("Enter temperatureserature in Fahrenheit "+i);
	            farhneits[i] = input.nextDouble();
	        }

	        // Convert temperatureseratures to Celsius and store in a separate array
	        char conversionUnit;
	        do {
	            System.out.println("Enter C to change farhneit to celcius: ");
	            conversionUnit = input.next().toUpperCase().charAt(0);
	        } while (conversionUnit != 'C');
	        
	        double[] celcius = new double[temperatures];
	        for (i=0;i<temperatures;i++) {
	        	if(farhneits[i]<32){
	        	double fahrenheit=farhneits[i];
	            double celsius = (fahrenheit-32)*5/9;
	        	
	            celcius[i] = celsius;}
	        }

	        
	        
	        // Display converted temperatureseratures
	        System.out.println("Converted temperatureseratures (Celsius):");
	        for(i=0;i<temperatures;i++){
	        	
	        	System.out.println("Celcius temp: "+celcius[i]+"°c");
	        	
	        }
		}

	}


}
