import java.util.Scanner;
public class Velocity{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		float v ,a,t;
		double fv,s;
		System.out.println("Enter value  of Velocity Acceleration and Time :");
		v = sc.nextFloat();
		a=sc.nextFloat();
		t=sc.nextFloat();
		
		fv=v+a*t;
		System.out.println("Final velocity is "+fv);
		
		s=v+a*t*t;
		System.out.println("Distance Travelled is :"+s);
	}	
}	