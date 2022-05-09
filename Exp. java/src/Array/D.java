package Array;

import java.util.Scanner;

public class D {
	public static int[] readArray()
	{
	  Scanner s=new Scanner(System.in);	
	  System.out.println("Enter the size of array");
	  int n=s.nextInt();
	  int[] a=new int[n];
	  System.out.println(" Enter the "+n+" Element ");
	  for(int i=0;i<a.length;i++)
	  {
		  a[i]=s.nextInt();
	  }
	  return a;
	}
	public static void displayArray(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	public static int prodArray(int []a)
	{
		int prod=1;
		for(int i=0;i<a.length;i++)
		{
			prod=prod*a[i];
		}
		return prod;
	}

	public static void main(String[] args) {
		
     int[] a=readArray();
     displayArray(a);
     int prod=prodArray(a);
     System.out.println(prod);
     
	}

}
