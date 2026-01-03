import java.util.Scanner;

public class InBetweenNum{
	public static void main(String[] args){
		Scanner sc = new  Scanner(System.in);

		int a,b,c;

		System.out.println("Enter Values of a b and c:");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if((a>b&&a<c)||(a>c&&a<b)){
				System.out.println("Number 1 is in between Number 2 and Number 3");		
		}else {
				System.out.println("Number 1 is not in between Number 2 and Number 3");
		}
	}
}