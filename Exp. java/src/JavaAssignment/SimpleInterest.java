package JavaAssignment;
import java.util.Scanner;
public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Principal Amount");
		double p=sc.nextDouble();
		double r=10;
		double t=2;
		double si=p*r*t/100;
		System.out.println("Simple Interest is "+si);

	}

}
