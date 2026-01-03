import java.util.Scanner;
	
	
public class Even100to150{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n; 
		System.out.println("Enter Value of n");
		n = sc.nextInt();
	
		System.out.println("Even Numbers in between 100 to 150");
		for(int i =100; i<=150;i++){
			if(i %2 == 0){
				System.out.println(i);
			}
		}
	}	
}