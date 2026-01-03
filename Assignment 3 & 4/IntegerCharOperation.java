import java.util.Scanner;

public class IntegerCharOperation{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a two number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		char ch = sc.next().charAt(0);

		switch(ch){
			case '+': System.out.println(a+"+"+b+"="+(a+b));
				break;
			case '-': System.out.println(a+"-"+b+"="+(a-b));
				break;
			case '*': System.out.println(a+"*"+b+"="+(a*b));
				break;
			case '/': System.out.println(a+"/"+b+"="+(a/b));
				break;
			case '%': System.out.println(a+"%"+b+"="+(a%b));
				break;
			default: System.out.println("Enter a valid operator");
		}
	}
}