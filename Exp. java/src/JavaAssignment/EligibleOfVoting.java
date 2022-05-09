package JavaAssignment;
import java.util.Scanner;
public class EligibleOfVoting {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println(" Enter the age");
        int a=s.nextInt();
        if(a>=18)
        {
        	System.out.println(a+" Is Eligible for Voting");
        }
        else
        {
        	System.out.println(a+" Is Not Eligible for Voting");
        }
	}

}
