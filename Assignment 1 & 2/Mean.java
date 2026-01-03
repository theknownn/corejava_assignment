import java.util.Scanner;

public class Mean{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
		float a , b;
		double am,hm;
	System.out.println("Enter values of a and b :");
		a = sc.nextFloat();
		b = sc.nextFloat();
		
		am=(a+b)/2;
		System.out.println("Arithmetic Mean is "+am);
	
		hm = a*b/(a+b);
		System.out.println("Harmonic Mean is :"+hm);
	}
}