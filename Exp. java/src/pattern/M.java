package pattern;

import java.util.Scanner;

public class M {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
	    int n= s.nextInt();
	    int k=1;
	    for(int i=0;i<n;i++)
	    {
	    	for(int j=0;j<n;j++)
	    	{
	    		if(i>=j)
	    		{
	    			System.out.print(k);
	    			k++;
	    		}
	    		if(k==10)
	    			k=1;
	    	}
	    	System.out.println(); 
	    }
	 }

	}

