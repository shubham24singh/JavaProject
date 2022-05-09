package Reverse;

import java.util.Scanner;

public class RevString2 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println(" enter the string ");
	String s=sc.nextLine();
	char[] a=s.toCharArray();
	String sn=" ";
	for(int i=0;i<a.length;i++)
	{
		sn=a[i]+sn;
	}
     System.out.println(sn);
	}

}
