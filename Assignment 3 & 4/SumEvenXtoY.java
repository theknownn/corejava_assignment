import java.util.Scanner;
	
	
public class SumEvenXtoY{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter Value of x");
		int x = sc.nextInt();
		System.out.println("Enter Value of Y");
		int y = sc.nextInt();
	
		int sum =0;
		for(int i =x; i<=y;i++){
			if(i %2 == 0){
				sum+=i;
				
			}
		}
		System.out.println("Sum of Even num between X and Y is : "+sum);
	}	
}