import java.util.Scanner;

public class CountDigit{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num");
		int n=sc.nextInt();
		int count=0;
		while(n>0){
			int digit=n%10;
			System.out.println(digit);
			n=n/10;
		count++;
		}
		System.out.println("count is "count);
	
	}
}
	