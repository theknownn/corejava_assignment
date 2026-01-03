import java.util.Scanner;

public class ArmstrongNo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num");
		int n = sc.nextInt();
		int count=0;
		int original=n;
		int sum=0;
		while(n>0){
			int digit=n%10;
			n=n/10;
			count++;
		}
		int x = original;
		while(x>0){
			int digit=x%10;
			int i=1;
			int power=1;
			while(i<=count){
				power=power*digit;
				i++;
			}
			x=x/10;
			sum=sum+power;
		}
		if(sum==original)
			System.out.println("Given no. is Armstrong");
	}
}