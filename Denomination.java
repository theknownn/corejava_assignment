import java.util.Scanner;

public class Denomination{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int amount, tennotes, fivenotes, onenotes;
	
		System.out.println("Enter amount to be withdrawn");
		amount = sc.nextInt();

		tennotes = amount/10;
		amount = amount%10;

		fivenotes=amount/5;
		amount = amount%5;

		onenotes = amount;
		
		System.out.println("Cashier will give the currancy as follows :");
		System.out.println("Cashier will have to give  the notes of 1 rs is "+onenotes);
System.out.println("Cashier will have to give  the notes of 5rs is "+fivenotes);
System.out.println("Cashier will have to give  the notes of 10 rs is "+tennotes);
		
	}
}