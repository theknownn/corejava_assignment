import java.util.Scanner;
public class Alphabets{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char ch;
		System.out.println("Enter Any character :");
		ch=sc.next().charAt(0);
		if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
			System.out.println("Previous Character is "+((char)(ch-1))+" and its next character is  "+((char)(ch+1)));	
		}
	}
}