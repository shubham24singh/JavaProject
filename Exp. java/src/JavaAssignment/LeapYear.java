package JavaAssignment;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the year");
		int y=s.nextInt();
		if(y%4==0)
		{
			System.out.println(" it is leap year");
		}
		else
		{
			System.out.println(" it is not leap year");
		}

	}

}
