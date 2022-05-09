package JavaAssignment;
import java.util.Scanner;
public class Factorial {
public static long Factorial(long a)
{
	long p=1;
	for(int i=1;i<=a;i++)
	{
		p=p*i;
	}
	return p;
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println(" Enter the Number");
		long n=s.nextLong();
		long factorial=Factorial(n);
		System.out.println("Factorial of "+n+" is "+factorial);
		

	}

}
