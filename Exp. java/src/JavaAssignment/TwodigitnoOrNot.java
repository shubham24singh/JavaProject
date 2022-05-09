package JavaAssignment;
import java.util.Scanner;
public class TwodigitnoOrNot {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println(" enter the value");
		int n=s.nextInt();
			if(n/10>=-9 && n/10<=9 && n/10!=0)
			{
				System.out.println(" it is two digit no");
			}
			else
			{
				System.out.println(" it is not two digit no");
			}
	}

}
