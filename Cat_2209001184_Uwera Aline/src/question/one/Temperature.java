package question.one;
import java.util.Scanner;
public class Temperature {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int Systemloop;
		int values;
		int i = 0;
		int u = 0;
	
		System.out.println("Enter the freaquency of the loop");
		Systemloop = input.nextInt();
		do {
		double[] Farhenheit = new double[5];
		double []Celsius = new double[5];
		System.out.println("Enter amount of celsius you have:");
		values = input.nextInt();
		for(i=0;i<=values-1;i++) {
		System.out.println("Enter Celsius:");
		Celsius[i] = input.nextDouble();
		}
		for(i=0;i<=values-1;i++) {
			
			if(Celsius[i]<0) {
				Farhenheit[i] = (9/5)*Celsius[i]+32;
				System.out.println("the temperature "+(i+1)+" in Farhenheit : "+Farhenheit[i]);
				
			}else if(Celsius[i]>=0) {
				System.out.println("the temperature "+(i+1)+" in Celsius : "+Celsius[i]);
				
			}
		}
		System.out.println("============================================");
		u++;
		}while(u<=Systemloop-1);
	}

}
