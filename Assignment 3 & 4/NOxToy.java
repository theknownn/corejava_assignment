import java.util.Scanner;

public class NOxToy{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a first no.");
		int x = sc.nextInt();
		System.out.println("Enter a second no.");
		int y = sc.nextInt();
		int i=x;
		while(i<=y){
		System.out.println(i);
		i++;
		}
	}
}