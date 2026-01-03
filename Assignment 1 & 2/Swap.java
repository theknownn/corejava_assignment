
import java.util.Scanner;

public class Swap{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a, b, temp;

	System.out.println("Enter values of a and b");
	a= sc.nextInt();
	b=sc.nextInt();

	
	System.out.println("Before Swapping Values of a : "+a+" and Value of b is "+b);
	System.out.println("Using temporary Variable");
	temp = a;
	a=b;
	b=temp;
	System.out.println("After Swapping Values of a is "+a+" and Value of b :"+b);


	
	
	}
}