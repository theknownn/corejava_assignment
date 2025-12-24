import java.util.Scanner;
public class Maximum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int a, b, c;
		System.out.println("Enter Value of the A and B and C :");
		a= sc.nextInt();
		b= sc.nextInt();
		c= sc.nextInt();
		
		if(a>b&&a>c){
			System.out.println("A is Greater !");	
		}else if(b>a&&b>c){
			System.out.println("B is Greater");
		}else if(c>a&&c>b){
			System.out.println("C is Greater ");
		}
		
	}
}	