package NewProgrames;

import java.util.Scanner;

public class RangeFactorial {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println(" Enter the range from 1");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{
		long fact=factorial(i);
		System.out.println(" factorial of "+i+" is= "+ fact);
	}
	}
	public static  long factorial(int n)
	{
		long fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	}

	