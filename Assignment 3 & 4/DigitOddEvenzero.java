import java.util.Scanner;

public class DigitOddEvenzero{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num");
		int n = sc.nextInt();
		
		while(n>0){
			int digit=n%10;
			if(digit==0)
				System.out.println("Digit is zero");
			else if(digit%2==0)
				System.out.println("Digit is even");
			else
				System.out.println("Digit is odd");
			n=n/10;
		}
	}
}

		