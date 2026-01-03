import java.util.Scanner;

public class OperationOnRadius{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a radius");

		double radius = sc.nextDouble();
		
		double area = 3.14*radius*radius;
		System.out.println("Area of circle is  "+area);

		System.out.println("Circumference of circle");
		double circumference= 2*3.14*radius;
		System.out.println("Circumference of circle   "+circumference);

		System.out.println("Volume of Sphere");
		double volume = (4*3.14*radius*radius*radius)/3;
		System.out.println("volume of sphere"+volume);
	}
}