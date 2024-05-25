//TEDD WUNDE ATU 2209000458
package question.one;
import java.util.Scanner;
public class TemperatureConverter {

	
	public static void main(String[] args) {
	    int celciusTemperatures;
		int temp;
		
		//creating scanner object
		Scanner input=new Scanner(System.in);
		//prompting the user for number of different temperature values he wants to input 
		System.out.println("How many temperatures do you want to input in Celsius");
		int numTemperature=input.nextInt();
		int[] numberTemperature=new int[numTemperature];
		
		//prompting the user for the number of temperature values to input in degree
		System.out.println("Enter temperatures in celsius");
		int mainTemperature=input.nextInt();
		int[] newcelciusTemperatures= new int[mainTemperature];
	  //for loop for temperatures
		for(int i=0;i<mainTemperature;i++){
			if(mainTemperature< 0 ){
			int fTemperatures=(mainTemperature*(9/5)+32);
				
			}else {
				throw new IllegalArgumentException("Invalid input");
			}
			
			//Array for converted temperatures
			//int[] convertedTemperature=new int[fTemperatures];
			//System.out.println("Converted temperatures: "+ fTemperatures);
		}
		

	}

}
