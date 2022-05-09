package JavaAssignment;
import java.util.Scanner;
public class Strong {
public static boolean isStrong(int n)
{
	int sum=0;
	int temp=n;
	while(n>0)
	{
		int r=n%10;
		sum=sum+Factorial(r);
		n=n/10;
		
	}
	return sum==temp;
}
public static int Factorial(int n)
{
	int factorial=1;
	for(int i=1;i<=n;i++)
	{
		factorial=factorial*i;
	}
	return factorial;
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println(" Enter the Number");
		int n=s.nextInt();
		boolean st=isStrong(n);
		System.out.println(st);
		}
}
