import java.util.Scanner;
public class Salary{
 	public static void main(String[] args){
		int id;
		double salary;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id of the employee and its basic salary");
		id = sc.nextInt();
		salary = sc.nextDouble();
		
		//Added house rent allowamnce 10%  and 30% dearness allowance and subtract the tax 5%
		salary = salary+(salary*0.1)+(salary*0.3)-(salary*0.05);

		System.out.println("The Id of Employee is "+id+" and Total Take home salary is "+salary);

		
	}
}