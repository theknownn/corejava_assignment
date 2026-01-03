import java.util.Scanner;

public class SumOf100To150{

	public static void main(String[] args){
		int i=100;
		int sum = 0;
		while(i<=150){
			sum+=i;
			i++;
		}
		System.out.println("sum is "+sum);
	}
}