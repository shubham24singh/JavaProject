package JavaAssignment;
import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the radius of circle ");
		double r=sc.nextDouble();
		double ar=3.143*r*r;
		double cir=2*3.143*r;
	    System.out.println("Radius is " +r);
		System.out.println("Area of Circle "+ar);
		System.out.println("Circumference of Circle is " + cir);
	

	}

}
