import java.util.Scanner;

public class Cuboid{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	double l , b, h;
	double a, v;

	System.out.println("Enter values of Length breadth and Height");
	l = sc.nextDouble();
	b= sc.nextDouble();
	h= sc.nextDouble();
	
	a = 2*(l*b+l*h+b*h);
	System.out.println("Area of cuboid is :"+a);

	v = l*b*h;
	System.out.println("Volume of Cuboid is :"+v);

	}	
}