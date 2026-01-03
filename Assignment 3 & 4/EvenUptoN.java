import java.util.Scanner;
	
	
public class EvenUptoN{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n; 
		System.out.println("Enter Value of n");
		n = sc.nextInt();
	
		System.out.println("Even Numbers Upto N");
		for(int i =1; i<=n;i++){
			if(i %2 == 0){
				System.out.println(i);
			}
		}
	}	
}