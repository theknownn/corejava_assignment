import java.util.Scanner;
	
	
public class Even1to10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n; 
		System.out.println("Enter Value of n");
		n = sc.nextInt();
	
		System.out.println("Even Numbers between 1 to 10");
		for(int i =1; i<=10;i++){
			if(i %2 == 0){
				System.out.println(i);
			}
		}
	}	
}