import java.util.Scanner;

public class Cylinder{
	public static void main(String[] args){
		float radius, height;
		Double area, volume;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Values of radius and height :");
		radius = sc.nextFloat();
		height = sc.nextFloat();
	
		area = 2*3.14*radius*radius+2*3.14*radius*height;
		System.out.println("Area of Cylinder is :"+area);

		volume = 3.14*radius*radius;
		System.out.println("Volume Of Circle is :"+volume);
		
	}	
}