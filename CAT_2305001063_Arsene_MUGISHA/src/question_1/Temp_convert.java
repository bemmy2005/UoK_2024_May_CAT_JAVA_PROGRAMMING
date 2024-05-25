package question_1;

import java.util.Scanner;

public class Temp_convert {

	
	public static void main(String[] args) {

		int temp, i;
		Scanner in=new Scanner(System.in);
		
		System.out.println("How many temperature to convert");
		temp=in.nextInt();
		
		System.out.println("Enter "+temp+" temperature in celsius to be converted");
		double [] celsius= new double[temp];
		
		for(i=0;i<temp;i++){
			System.out.println("Enter "+(i+1)+" temperature");
			celsius[i]=in.nextDouble();
		}
		do{
			String F,f = null;
			System.out.println("Enter F to convert celsius temp to fahrneit");
			F=in.next();
			F=f;
		}
		while(i<1);
		
		double [] fahrneit=new double[temp];
		for(i=0;i<temp;i++){
			if(celsius[i]<0){
				
				fahrneit[i]=((9/5)*celsius[i]+32);
			}}
			System.out.println("Converted Celcius temp to fahrneit are:");
			for(i=0;i<temp;i++){
				System.out.println(fahrneit[i]+"F");
			
		}

	}

}
