import java.util.Scanner;

public class FactorsOfNO{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a n");
		int n =sc.nextInt();
		int i=1;
		int count=0;
		int sum=0;
		while(i<n/2){
			if(n%i==0){
				System.out.println(i);
				sum=sum+i;
				count++;
			
			}

				i++;
		}
		System.out.println("no. of factors"+count);
		System.out.println("sum of factors"+sum);
	}
}