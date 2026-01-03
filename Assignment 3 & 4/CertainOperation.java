import java.util.Scanner;

public class CertainOperation{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number");
		int a = sc.nextInt();
     		int b = sc.nextInt();
		
		System.out.println("Equality operation");
		if(a==b)
		System.out.println(" a is equal to b");
		else if(a<b)
		System.out.println(" a is less than b");
		else 
		System.out.println(" a is greater than b");
		
		System.out.println("Quatient and reminder operation");
		System.out.println("Quatient is"+(a/b));
		System.out.println("Reminder is"+(a%b));

		System.out.println("Enter a third no");
		int c = sc.nextInt();
		System.out.println("Range in between or not..........");
		if(c<a&&c>b||c>a&&c<b)
			System.out.println("c is lies in between a and b");
		else
			System.out.println(" c is not lies in between a and b");

		System.out.println("Swapping ");
		int temp=a;
		a=b;
		b=temp;
		System.out.println("Number after swapping");
		System.out.println("a is"+a);
		System.out.println("b is"+b);
	
				
	}
}