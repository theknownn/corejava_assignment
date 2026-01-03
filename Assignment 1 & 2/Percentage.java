import java.util.Scanner;

public class Percentage{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int java, sql,aws; int total;
		System.out.println("Enter marks of java , sql and aws");
		java = sc.nextInt();
		sql = sc.nextInt();
		aws = sc.nextInt();
		total = java+sql+aws;
		float avg = total/3;
		if(avg>80){
			System.out.println("Class 1 Studebt");
		}else if (avg>60 && avg<80){
			System.out.println("Class 2 Student");
		}else if(avg>35 && avg<60){
			System.out.println("Class 3 Student");
		}else{
			System.out.println("Fail !!");
		}
			
	}
}