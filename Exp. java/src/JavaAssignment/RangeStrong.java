package JavaAssignment;
import java.util.Scanner;
public class RangeStrong {
public static boolean isStrong(int n)
{   
	int temp=n;
	int sum=0;
	while(n>0)
	{
		int r=n%10;
		sum=sum+factorial(r);
		n=n/10;
	}
	return sum==temp;
}
public static int factorial(int n)
{
	int fact=1;
	for(int i=1;i<=n;i++)
	{
		fact=fact*i;
	}
	return fact;
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println(" Enter the first Value");
		int m=s.nextInt();
		System.out.println("Enter the Second Value ");
		int n=s.nextInt();
		int count=0;
		for(int i=m;i<=n;i++)
		{
			boolean strong=isStrong(i);
			if(strong==true)
			{
				System.out.println(i);
				count++;
			}
		}
		System.out.println("total number of Strong no between "+m+" and "+n+" is "+count);
	}

}
