import java.util.Scanner;

public class LeepYear{
	public static void main(String[] args){
		Scanner sc = new  Scanner(System.in);

		int year;

		System.out.println("Enter Value of num :");
		year = sc.nextInt();

		if(year %400==0 || (year%4==0 && year % 100!=0)){
				System.out.println("This is a leep Year");		
		}else{
				System.out.println("This is not a leep Year");
		}
	}
}