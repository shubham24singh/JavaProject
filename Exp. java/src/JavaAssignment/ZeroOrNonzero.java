package JavaAssignment;

import java.util.Scanner;

public class ZeroOrNonzero {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println(" Enter the Value");
		int n=s.nextInt();
		if(n==0)
		{
			System.out.println(" It is zero Number");
		}
		else
		{
			System.out.println(" It is non zero Number");
		}

	}

}
