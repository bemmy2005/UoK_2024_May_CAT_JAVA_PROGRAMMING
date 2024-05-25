package QUESTIONONE;
	import java.util.Scanner;
	public class temperatures {
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter the number of temperature");
		int numbertemperature=input.nextInt();
		double[]fahrenheittemperature=new double[numbertemperature];
		double[]convertedtemperature=new double[numbertemperature];
		System.out.println("enter temperature in fahrenheit");
		for(int i=0; i<numbertemperature; i++){
			fahrenheittemperature[i]=input.nextDouble();
		}
		for(int i=0; i<numbertemperature; i++){
			double fahrenheit=fahrenheittemperature[i];
			if(fahrenheit<32){
				double celsius=(fahrenheit-32)*5/9;
				convertedtemperature[i]=celsius;
			}
			}
		System.out.println("converted temperature below freezing in celsius");
		for (double temperature: convertedtemperature){
			if (temperature !=0){
				System.out.println(temperature);
			}
		}
		}
	}

