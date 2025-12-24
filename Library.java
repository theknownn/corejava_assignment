import java.util.Scanner;
public class Library{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int num;
		System.out.println("Enter number of days after you returning the book :");
		num= sc.nextInt();
		
		if(num<5){
			System.out.println("You have to give 50 Rs of Fine ");
		}	
		else if(num>6 && num< 10){
			System.out.println("You have to give 100 Rs of Fine ");
		}	
		else if(num>10){
			System.out.println("You have to give 150 Rs of Fine ");
		}
	}
}