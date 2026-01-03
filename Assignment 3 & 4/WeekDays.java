import java.util.Scanner;

public class WeekDays{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a num for week days");
		int n =sc.nextInt();
		if(n<7&&n>=0){
			switch(n){
				case 1: System.out.println("Today is monday");
				break;
				case 2: System.out.println("Today is Tuesday");
				break;
				case 3: System.out.println("Today is Wednesday");
				break;
				case 4: System.out.println("Today is Thursday");
				break;
				case 5: System.out.println("Today is Friday");
				break;
				case 6: System.out.println("Today is saturday");
				break;
				case 0: System.out.println("Today is sunday");
				break;
				default: System.out.println("Enter a valid no.");
			} 
		}
		else
			System.out.println("invalid no.");
	}
}