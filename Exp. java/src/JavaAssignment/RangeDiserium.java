package JavaAssignment;
import java.util.Scanner;
public class RangeDiserium {
public static boolean isDiserium(int n)
{
	int temp=n;
	int count=countDigit(n);
	int sum=0;
	while(n>0)
	{
		int r=n%10;
		sum=sum+getPower(r,count);
		count--;
		n=n/10;
	}
	return sum==temp;
}
public static int countDigit(int d)
{
	int count=0;
	do {
		d=d/10;
		count++;
	}
	while(d!=0);
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
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println(" Enter the first value");
		int m=s.nextInt();
		System.out.println(" Enter the Second Value ");
		int n=s.nextInt();
		int count=0;
		for(int i=m;i<=n;i++)
		{
			boolean diserium=isDiserium(i);
			if(diserium==true)
			{
				System.out.println(i);
				count++;
			}
		}
		System.out.println(" total diserium number between "+m+" and "+n+" is "+ count);

	}

}
