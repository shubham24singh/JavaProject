package JavaAssignment;
import java.util.Scanner;
public class ValidMonth {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println(" Enter the Month Number");
		int m=s.nextInt();
        if(m>=1 && m<=12)
        {
        	System.out.println(" It is Valid month number");
        }
        else
        {
        	System.out.println(" It is not Valid month number");
        }
	}

}
