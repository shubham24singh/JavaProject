package Reverse;

import java.util.Scanner;

public class RevNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println(" Enter the number");
		int n=s.nextInt();
		String rev=" ";
		while(n!=0)
		{
			int d=n%10;
			rev=rev+d;
			n=n/10;
		}
        System.out.println(rev);
	}

}
