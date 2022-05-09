package Array;

import java.util.Scanner;

public class Mergertwoarrays {
	public static int[] readArray()
	{
		Scanner s= new Scanner(System.in);
		System.out.println(" Enter the Size of Array");
		int n=s.nextInt();
		int ar[]=new int[n];
		System.out.println(" Enter "+n+" element");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=s.nextInt();
		}
		return ar;
	}
	public static void displayArray(int[]ar)
	{
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
	}
	public static int[] mergeArray(int a[],int b[])
	{
		int m[]=new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			m[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			m[a.length+i]=b[i];
		}
		return m;
	}

	public static void main(String[] args) {
		System.out.println(" Read first Array");
		int x[]=readArray();
		System.out.println("Read Second Array ");
		int y[]=readArray();
		displayArray(x);
		displayArray(y);
		int[] m=mergeArray(x,y);
		for(int i=0;i<m.length;i++)
		{
			System.out.println(m[i]);
		}
	}

}
