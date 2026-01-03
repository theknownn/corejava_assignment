import java.util.Scanner;

public class NumberToWords{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int n = sc.nextInt();
			
		int rev= 0;
		while(n>0){
			int rem = n%10;
			rev = rev *10+rem;
			n = n/10;
		}
		while(rev>0){
			int digit = rev%10;
			switch(digit){
				case 0 :System.out.println("Zero");break;
				case 1 :System.out.println("One");break;
				case 2 :System.out.println("Two");break;
				case 3 :System.out.println("Three");break;
				case 4 :System.out.println("Four");break;
				case 5 :System.out.println("five");break;
				case 6 :System.out.println("Six");break;
				case 7 :System.out.println("Seven");break;
				case 8 :System.out.println("Eight");break;
				case 9 :System.out.println("Nine");break;
			}
			rev = rev/10;
		}
		
	}
}