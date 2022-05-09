package JavaAssignment;
import java.util.Scanner;
public class PositiveOrNegative {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Integer value");
		int a=s.nextInt();
		if(a>0)
		{
			System.out.println(a+" is a positive integer");
		}
		else
		{
			System.out.println(a+" is a negative integer");
		}
	}	
}

