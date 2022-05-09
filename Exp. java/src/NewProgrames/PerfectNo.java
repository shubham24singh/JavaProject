package NewProgrames;

import java.util.Scanner;

public class PerfectNo {
public static boolean isPerfect(int n) {
	int sum=0;
	for(int i=1;i<n;i++) {
		if(n%i==0) {
			sum=sum+i;
		}
	}
	return sum==n;
}
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println(" Enter the number ");
	 int s=sc.nextInt();
	 boolean perfect=isPerfect(s);
      if(perfect==true) {
    	  System.out.println(s+" is perfect No.");
      }
      else {
    	  System.out.println(s+" is not a perfect no");
      }
	}

}
