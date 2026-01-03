import java.util.Scanner;

public class PrimeNo{
	public static void main(String[] args){
	
	long n,count=0;

	Scanner sc = new Scanner(System.in);
	n = sc.nextLong();

	for(int i=1;i<=n;i++){
	    if(n%i==0)
	    count++;
	}
	if(count==2)
	    System.out.println("Prime Number!!");
	else
	    System.out.println("Not prime Number!!");
	}
}
	