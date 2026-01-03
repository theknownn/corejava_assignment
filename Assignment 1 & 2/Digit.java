import java.util.Scanner;
public class Digit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char ch;
		System.out.println("Enter Any character :");
		ch=sc.next().charAt(0);
		if(ch>='a' && ch<='z' || ch>='A' && ch<='Z' ){
			System.out.println("This is a Character "+ch);	
		}else if(ch>= '0' && ch<='9'){
			System.out.println("This Is a number  "+ch);	
		}

	}
}