package Array;

import java.util.Scanner;

public class InsertElementInArray {
public static int[] readArray()
{
	Scanner s=new Scanner(System.in);
	System.out.println(" Enter the size of the array");
	int n=s.nextInt();
	int ar[]=new int[n];
	System.out.println("Enter "+n+" elements ");
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
  public static int[] insertArray(int[]ar,int ele,int in)
  {
//	  if index is less than 0 or index is greater than ar.length then return it by giving a message
	  if(in<0||in>ar.length)
	  {
		  System.out.println(" index not in range");
		  return ar;
	  }
	  int y[]=new int[ar.length+1];
	  y[in]=ele;
	  for(int i=0;i<ar.length;i++)
	  {
		  if(i<in)
		y[i]=ar[i];
		  else
			  y[i+1]=ar[i];
	  }
	  return y;
  }
	public static void main(String[] args) {
		int x[]=readArray();
		System.out.println(" before insert ");
		displayArray(x);
        x=insertArray(x,39,2);
        System.out.println(" after insert ");
        displayArray(x);
	}

}
