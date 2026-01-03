
import java.util.Scanner;

public class Swap2{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a, b;

	System.out.println("Enter values of a and b");
	a= sc.nextInt();
	b=sc.nextInt();

	System.out.println("Swapping without temp variable Swapping Values of a : "+a	+" and Value of b is "+b);
	a =a*b;
	b=a/b;
	a=a/b;

	System.out.println("After Swapping Values of a is "+a+" and Value of b :"+b);
	a =a+b;
	b=a-b;
	a=a-b;

	System.out.println("After Swapping Values of a is "+a+" and Value of b :"+b);


	}
}