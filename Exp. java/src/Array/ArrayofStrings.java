package Array;

import java.util.Scanner;

public class ArrayofStrings {

	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println(" enter the size of array ");
		int n=s.nextInt();
		String a[]=new String[n];
		System.out.println(" enter the "+n+" String");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.next();
		}
		for(int i=0;i<a.length;i++)
		{
			String b=a[i];
			if(b.charAt(b.length()-1)=='a')
			{
				System.out.println(a[i]);
			}
		}			
	}
}