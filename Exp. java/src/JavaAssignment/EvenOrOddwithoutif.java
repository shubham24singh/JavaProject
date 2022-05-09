package JavaAssignment;
import java.util.Scanner;
public class EvenOrOddwithoutif {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println(" Enter a Integer Value");
		int a=s.nextInt();
		System.out.println(a%2==0?"It is even No":"It is odd Number");

	}

}
