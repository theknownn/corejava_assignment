import java.util.Scanner;

public class Triangle{
	public static void main(String[] args){
		Scanner sc = new  Scanner(System.in);

		int a,b,c;

		System.out.println("Enter Value of num :");
		a = sc.nextInt();
		b = sc.nextInt();
		c=sc.nextInt();

		if((b+c)>a||(a+c)>b||(a+b)>c){
				System.out.println("This is a valid Triangle");		
		}else{
				System.out.println("This is not a valid Triangle");
		}
	}
}