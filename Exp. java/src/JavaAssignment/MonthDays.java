package JavaAssignment;
import java.util.Scanner;
public class MonthDays {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        System.out.println(" Enter the Month Number");
        int n=s.nextInt();
        int[]d= {0,31,28,31,30,31,30,31,31,30,31,30,31};
        
        if(n>0&&n<=12)
        {
        	System.out.println("month days are in "+n+" is "+d[n]);
        }
        else
        {
        	System.out.println(" It is not a Month number");
        }
	}

}
