package NewProgrames;
// 153=1+125+27 sum of power of their individual digits
import java.util.Scanner;

public class Armstrong {
public static boolean isArmStrong(int i)
{
	int count=digit(i);
	int temp=i;
	int sum=0;
	while(i!=0)
	{
		int x=i%10;
		sum=sum+power(x,count);
		i=i/10;
	}
	return temp==sum;
}
public static int digit(int n)
{
	int count=0;
	do {
		int x=n%10;
		count++;
		n=n/10;
	}while(n!=0);
	return count;
	
}
public static int power(int x,int n)
{
	int power=1;
	for(int i=1;i<=n;i++)
	{
		power=power*x;
	}
	return power;
}
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the Range from 1 ");
	int num=sc.nextInt();
	for(int i=0;i<=num;i++)
	{
		boolean arm =isArmStrong(i);
		if(arm==true)
		{
			System.out.println(" armstrong no is -->"+i);
		}
	}
	

	}

}
