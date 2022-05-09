package NewProgrames;

import java.util.Scanner;

public class PrimeNoWIthinRange {
public static boolean isPrime(int n) {
	int count=0;
	for(int i=2;i<n;i++) {
		if(n%i==0)
		{
		  count++;
		  break;
		}
	}
		return count==0;
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println(" Enter the Range: a->");
	int a=sc.nextInt();
	System.out.println(" Enter the b-->");
	int b=sc.nextInt();
	System.out.println(" The prime between a to b are--->");
	for(int i=a;i<=b;i++) {
     boolean prime =isPrime(i);
     if(prime==true) {
    	 System.out.println(i);
     }
	}
}
}