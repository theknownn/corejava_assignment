import java.util.Scanner;
public class Alphabet{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char ch;
		System.out.println("Enter Any character :");
		ch=sc.next().charAt(0);
		if(ch>='a' && ch<='z'){
			System.out.println("Character is "+ch+" and its uppercase is "+((char)(ch-32)));	
		}else if(ch>='A' && ch<='Z'){
			System.out.println("Character is "+ch+" and its uppercase is "+((char)(ch+32)));	
		}

	}
}