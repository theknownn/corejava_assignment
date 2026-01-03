import java.util.Scanner;

public class SumOf1ToN{
 	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num");
		int n = sc.nextInt();
		int i=1,sum=0;
		
		while(i<=n){
			sum+=i;
			i++;

			}
		
		System.out.println("sum "+sum);
	}
}