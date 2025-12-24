import java.util.Scanner;

public class CheckNum2{
	public static void main(String[] args){
		Scanner sc = new  Scanner(System.in);

		int num;

		System.out.println("Enter Value of num :");
		num = sc.nextInt();

		if(num%5==0){
				if(num%7==0){
						System.out.println("Number is divisible by 5 and 7");	
				}else{
					System.out.println("Number is not divisible by 5 and 7");
				}
		}
	}
}