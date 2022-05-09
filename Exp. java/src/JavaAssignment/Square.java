package JavaAssignment;
import java.util.Scanner;
public class Square {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println(" enter the side of square");
	 double s=sc.nextDouble();
	 double ar=s*s;
	 double per=4*s;
	 System.out.println("Area of Square is "+ar);
	 System.out.println("Perometer of Square is "+per);

	}

}
