package JavaAssignment;
import java.util.Scanner;
public class ArithmeticOperation {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println(" Enter two values");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int multi=a*b;
	int add=a+b;
	int div=a/b;
	int sub=a-b;
	System.out.println("Multiplication: "+multi);
	System.out.println("ADD: "+add);
	System.out.println("DIVISION: "+div);
	System.out.println("SUBSTRACTION: "+sub);
		
		
	}

}
