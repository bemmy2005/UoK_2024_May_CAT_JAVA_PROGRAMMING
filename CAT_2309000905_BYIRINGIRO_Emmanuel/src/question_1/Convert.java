
//BYIRINGIRO EMMANUEL

package question_1;

import java.util.Scanner;

public class Convert {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int temp,i;
		System.out.println("enter the number of temperature");
		temp=input.nextInt();
		for(i=0;i<temp;i++)
		{
			System.out.println("enter the temperature in celsius[%d]"+i);
			double c=input.nextDouble();
			if(c<0){
				double f=(9/5)*c+32;
				System.out.println("Fahrenheit="+f+"F");
			}

		}

	}

}


