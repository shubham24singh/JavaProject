package NewProgrames;

import java.util.Scanner;
public class FibonacciSeries {
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the first number");
	 int n1=sc.nextInt();
	 System.out.println("Enter the second number");
	 int n2=sc.nextInt();
	 System.out.println("Enter the Count of series");
	 int count=sc.nextInt();
	 int n3;
	 System.out.print(n1+" "+n2);
	 for(int i=2;i<=count;i++) //i starts from 2 because two no. are already taken.
	 {
		 n3=n1+n2;
		 System.out.print(" "+n3);
		 n1=n2;
		 n2=n3;
	 }
	}
}
