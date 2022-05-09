package pattern;
import java.util.Scanner;
public class R {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println(" enter the number");
	int n=s.nextInt();
	int k=5;
	for(int i=1;i<=n;i++)
	{
		for( int j=1;j<=n;j++)
		{
			System.out.print(k+" ");
		}
		k--;
		System.out.println();
	}
  }
}
