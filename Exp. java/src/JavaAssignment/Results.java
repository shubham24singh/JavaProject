package JavaAssignment;
import java.util.Scanner;
public class Results {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println(" Enter Four Subjects Marks ");
		int p=s.nextInt();
		int c=s.nextInt();
		int m=s.nextInt();
		int e=s.nextInt();
		if(p<35||c<35||m<35||e<35)
		{
			System.out.println(" Fail");
		}
		else {
			double per=p+c+m+e/4;
			if(per >=85)
			{
				System.out.println("Distinction");
			}
			else if(per >=60)
			{
				System.out.println("First Class");
			}
			else if(per >=50)
			{
				System.out.println("Second Class");
			}
			else
			{
				System.out.println(" Passed");
			}
			
		}
	}
}
