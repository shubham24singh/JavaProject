package pattern;

import java.util.Scanner;

public class N {


	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
	    int n= s.nextInt();
	    int k=1;
	    for(int i=0;i<n;i++)
	    {
	    	for(int j=0;j<n;j++)
	    	{
	    		if(j<=i)
	    		{
	    			System.out.print("* ");
	    		}
	    		else
	    		{
	    			System.out.print(" ");
	    		}
	    	}
	    	System.out.println(); 
	    }
	 }

	}