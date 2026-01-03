import java.util.Scanner;

public class Check{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);


		int num;
		System.out.println("Enter Value of Num :");
		num=sc.nextInt();

		if(num>0){
		System.out.println("Number is Positive !");
		}else{
			System.out.println("Number Is Negative !");
		}
	}
}