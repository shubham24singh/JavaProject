package JavaAssignment;
import java.util.Scanner;
public class Armstrong {
public static boolean isArmstrong(int n)
{
	int temp=n;
	int sum=0;
	while(n>0)
	{
		int r=n%10;
		sum=sum+r*r*r;
		n=n/10;
	}
	return sum==temp;
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=s.nextInt();
		boolean arm=isArmstrong(n);
		System.out.println(arm);
	}
}
