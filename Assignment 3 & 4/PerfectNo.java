import java.util.Scanner;

public class PerfectNo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a n");
		int n= sc.nextInt();
		int i=1;
		int sum=0;
		while(i<=n/2){
			if(n%i==0)
			sum+=i;		
				i++;	
		}
		System.out.println("Sum Is "+sum);
		if(sum==n)
			System.out.println("The given no is perfect no");

	}
}
