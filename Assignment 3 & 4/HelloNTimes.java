import java.util.Scanner;

public class HelloNTimes{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter how many times you want to enter hello");
		int n = sc.nextInt();
		int i=0;
		while(i<n){
			System.out.println("Hello");
			i++;
		}
	}
}
