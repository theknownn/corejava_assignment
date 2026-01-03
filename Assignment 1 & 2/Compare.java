import java.util.Scanner;

public class Compare{
	public static void main(String[] args){
		Scanner sc = new  Scanner(System.in);

		int a,b;

		System.out.println("Enter Value of a and b :");
		a = sc.nextInt();
		b=sc.nextInt();

		if(a==b){
				System.out.println("Both are Equal");		
		}else if(a>b){
				System.out.println("A is Greater than B");
		}else if(b>a){
				System.out.println("B is Greater than A");
		}
	}
}