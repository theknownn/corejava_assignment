import java.util.Scanner;

public class SumOfxToy{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a first no.");
		int x = sc.nextInt();
		System.out.println("Enter a second no.");
		int y = sc.nextInt();
		int i=x;
		int sum=0;
		while(i<=y){
		sum+=i;
		i++;
		}
		System.out.println("sum "+sum);
	}
}