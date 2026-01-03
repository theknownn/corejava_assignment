import java.util.Scanner;

public class Discount{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int item1=0, item2=0, item3=0;
		 double total=0;
		double discount;
		int price1, price2,price3;
		System.out.println("Enter Quantity of Item 1 :");
		item1 = sc.nextInt();
		System.out.println("Enter Quantity of Item 2 :");
		item2 = sc.nextInt();
		System.out.println("Enter Quantity of Item 3 :");
		item3 = sc.nextInt();
		System.out.println("Enter Price of Item 1 :");
		price1 = sc.nextInt();
		System.out.println("Enter Price of Item 2 :");
		price2 = sc.nextInt();
		System.out.println("Enter Price of Item 3 :");
		price3 = sc.nextInt();

		total = item1*price1+item2*price2+item3*price3;
	
		if(total>80000){
			System.out.println("Total Amount is :"+total);
			discount = total-(total*0.30);
			System.out.println("You get 30 % discount on your Amount :"+discount);
		}else if (total>50000 && total<80000){
			System.out.println("Total Amount is :"+total);
			discount = total-(total*0.20);
			System.out.println("You get 30 % discount on your Amount :"+discount);
		}else if(total>35000 && total<50000){
			System.out.println("Total Amount is :"+total);
			discount = total-(total*0.10);
			System.out.println("You get 30 % discount on your Amount :"+discount);
		}	
	}
}