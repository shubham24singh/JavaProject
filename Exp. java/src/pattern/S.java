package pattern;
import java.util.Scanner;
public class S {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println(" enter the number");
	int n=s.nextInt();
	int k=1;
	for(int i=1;i<=n;i++)
	{
		for(int j=i;j<=i;j++)
		{
			System.out.print(k+" ");
		}
		k++;
		System.out.println();
	}
  }
}

