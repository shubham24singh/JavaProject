package JavaAssignment;
import java.util.Scanner;
public class RangePrime {
public static boolean isPrime(int n)
{
	for(int i=2;i<n;i++)
	{
		if(n%i==0)
		{
			return false;
		}
	}
     return true;
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Range:");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			boolean prime=isPrime(i);
			if(prime==true)
			{
				System.out.println(i);
			}
		}
	}

}
