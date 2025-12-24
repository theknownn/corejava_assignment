import java.util.Scanner;

public class CheckChar{
	public static void main(String[] args){
		Scanner sc = new  Scanner(System.in);

		char ch;

		System.out.println("Enter Value of Character :");
		ch = sc.next().charAt(0);
		if(ch>='a'&& ch<='z'){
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
				System.out.println("Character is Vowels");		
			}else{
				System.out.println("Character is Consonant");
				}
		}else{
			System.out.println("Please Enter character in lowercase .");
		}
		
	}
}