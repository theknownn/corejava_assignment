import java.util.Scanner;

public class DigidToWord{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		int rev=0;
		while(n>0){
			int digit = n%10;
			rev = rev*10+digit;
			n=n/10;
		}
		System.out.println("Reverse no.is "+rev);
		while(rev>0){
			int digit = rev%10;
			rev=rev/10;

		switch(digit){
			case 0: System.out.println("zero");
			break;
			case 1: System.out.println("one");
			break;
			case 2: System.out.println("two");
			break;
			case 3: System.out.println("three");
			break;
			case 4: System.out.println("four");
			break;
			case 5: System.out.println("five");
			break;
			case 6: System.out.println("Six");
			break;
			case 7: System.out.println("Seven");
			break;
			case 8: System.out.println("eight");
			break;
			case 9: System.out.println("nine");
			break;
			default: System.out.println("Enter a valid no.");
			}
		}
	}
}