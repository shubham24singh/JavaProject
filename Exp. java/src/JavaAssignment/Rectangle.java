package JavaAssignment;
import java.util.Scanner;
public class Rectangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of Rectangle");
		int l=sc.nextInt();
		System.out.println("Enter width of Rectangle");
		int b=sc.nextInt();
		int ar=l*b;
		int per=2*(l+b);
		System.out.println("area of rectangle is "+ar);
		System.out.println("perimeter of rectangle is "+per);
		

	}

}
