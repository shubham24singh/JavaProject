package pattern;
import java.util.Scanner;
public class Q {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println(" enter the number");
	int n=s.nextInt();
	for(int i=n;i>=1;i--)
	{
		for( int j=i;j>=1;j--)
		{
			System.out.print(j+" ");
		}
		System.out.println();
	}
  }
}
