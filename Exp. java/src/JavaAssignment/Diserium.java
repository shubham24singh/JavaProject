package JavaAssignment;
import java.util.Scanner;
public class Diserium {
public static int countDigit(int n)
{
	int count=0;
	do
	{
		n=n/10;
		count++;
	}
	while(n>0);
	return count;
}
public static int getPower(int n,int p)
{
	int pw=1;
	while(p>0)
	{
		pw=pw*n;
		p--;
	}
	return pw;
}
public static boolean isDiserium(int n)
{
	int sum=0;
	int temp=n;
	int count=countDigit(n);
	while(n>0)
	{
		int r=n%10;
		sum=sum+getPower(r,count);
		n=n/10;
		count--;
	}
	return sum==temp;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Range");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			boolean diserium=isDiserium(i);
			if(diserium==true)
			{
				System.out.println(i);
			}
		}
 }
}
