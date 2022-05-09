package JavaAssignment;
import java.util.Scanner;
public class NumberOrDigit {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Integer Value");
		int n=s.nextInt();
		if(n/10==0)
		{
			System.out.println(n+" is a digit ");
		}
		else
		{
			System.out.println(n+" is a Number ");
		}

	}

}
