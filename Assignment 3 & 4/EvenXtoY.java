import java.util.Scanner;
	
	
public class EvenXtoY{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter Value of x");
		int x = sc.nextInt();
		System.out.println("Enter Value of Y");
		int y = sc.nextInt();
	
		System.out.println("Even Numbers between X and Y");
		for(int i =x; i<=y;i++){
			if(i %2 == 0){
				System.out.println(i);
			}
		}
	}	
}