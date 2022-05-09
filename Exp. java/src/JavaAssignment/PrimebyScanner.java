package JavaAssignment;

import java.util.Scanner;

public class PrimebyScanner {
	public static void Prime(int a)
	{
		int count=0;
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				System.out.println("False");
				count++;
				break;
			}
		}
		if (count==0)
		{
			System.out.println("True");
		}
	}
     public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 System.out.println(" Enter the Number");
	 int n=s.nextInt();
	 Prime(n);
	}
}
