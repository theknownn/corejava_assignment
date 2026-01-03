import java.util.Scanner;
public class IncomeTax{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		double salary;double tax;
		System.out.println("Enter Basic Salary :");
		salary= sc.nextDouble();		
		if(salary<150000){
			tax =0;
			System.out.println("You have to pay 0 %  tax : "+tax);
		}else if(salary>150000 && salary<300000){
			tax = salary *0.20;
			System.out.println(" You have to pay 20 % of tax  : "+tax);
		}else if(salary>300000){
			tax = salary*0.30;	
			System.out.println("3RD QUADRANT");
		}
		
	}
}