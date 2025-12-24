import java.util.Scanner;

public class Temp{
	public static void main(String[] args){
		Double f;
		Double c,k;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Temperature in Fahrenheit :");
		f=sc.nextDouble();

		c=(5*(f-32))/9;

		System.out.println("Conversion of Fahrenheit in Celcius is :"+c);
		
		k = c +273.15;
		System.out.println("Conversion of Temperture in Kelvin is :"+k);
	}	
}