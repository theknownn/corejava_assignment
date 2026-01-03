import java.util.Scanner;

public class SumOf1to5{

	public static void main(String[] args){
		int i=1;
		int sum = 0;
		while(i<=5){
			sum+=i;
			i++;
		}
		System.out.println("sum is "+sum);
	}
}