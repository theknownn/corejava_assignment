import java.util.Scanner;

public class AreaCircle{
 	public static void main(String[] args){
		float radius; Double area, circumference;
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter Radius of the circle :");	
		radius = sc.nextFloat();
		area = 3.14*radius*radius;
		System.out.println("Area of Circle is :"+area);

		circumference = 2 *3.14*radius;

		System.out.println("Circumference of Circle : "+circumference);
}	
		
}