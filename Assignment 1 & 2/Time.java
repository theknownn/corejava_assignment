import java.util.Scanner;

public class Time{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int hr ,min,sec;
		System.out.println("Enter Hour min and seconds ");
		hr = sc.nextInt();
		min = sc.nextInt();
		sec = sc.nextInt();
		
		if(hr>0&&hr<=24){
			System.out.println("Hour Is Valid");
			if(min>0 && min<60){
				System.out.println("Minutes are Valid");
				if(sec>0 && sec<60){
					System.out.println("Seconds Are Valid");		
				}else{
					System.out.println("Seconds are not valid");
				}
			}else{
				System.out.println("Minutes are not valid");
			}
		}else{
			System.out.println("Hours are not valid");
		}
	}
}