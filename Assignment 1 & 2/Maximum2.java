import java.util.Scanner;
public class Maximum2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int a, b, c;
		System.out.println("Enter Value of the A and B and C :");
		a= sc.nextInt();
		b= sc.nextInt();
		c= sc.nextInt();
		
		if(a>b){
			b=a;
		}else if(c>b){
			b=c;
		}
			System.out.println("B is Greater ");
		
	}
}	