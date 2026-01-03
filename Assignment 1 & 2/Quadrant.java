import java.util.Scanner;
public class Quadrant{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int x, y;
		System.out.println("Enter Value of the A and B :");
		x= sc.nextInt();
		y= sc.nextInt();
		
		if(x>0&&y>0){
			System.out.println("1ST QUADRANT");
		}	
		if(x<0&&y>0){
			System.out.println("2ND QUADRANT");
		}	
		if(x<0&&y<0){
			System.out.println("3RD QUADRANT");
		}
		if(x>0&&y<0){
			System.out.println("4 TH QUADRANT");
		}	
	}
}