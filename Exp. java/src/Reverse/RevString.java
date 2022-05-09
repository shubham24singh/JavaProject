package Reverse;

import java.util.Scanner;

public class RevString {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println(" Enter the String");
	String given=s.nextLine();
	String n=" ";
	for(int i=0;i<given.length();i++)
	{
		char c=given.charAt(i);
		n=c+n;
	}
	System.out.println(n);
	}

}
