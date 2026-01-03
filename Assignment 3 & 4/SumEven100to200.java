import java.util.Scanner;
	
	
public class SumEven100to200{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);	
		
		int sum =0;
		for(int i =100; i<=200;i++){
			if(i %2 == 0){
				sum+=i;
				
			}
		}
		System.out.println("Sum of even numbers from 100 to 200  is :"+sum);
	}	
}