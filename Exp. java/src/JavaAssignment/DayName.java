package JavaAssignment;
import java .util.Scanner;
public class DayName {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the day number");
		int n=s.nextInt();
		String[]d= {"No day name","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		if(n>0&&n<=7)
		{
			System.out.println("The day name of "+n+" is "+d[n]);
		}
		else 
		{
			System.out.println("it is not a day number");
		}
	}

}
