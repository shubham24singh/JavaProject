package NewProgrames;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number");
    int n=sc.nextInt();
    int rev=0;
    while(n!=0)
    {
    	int x=n%10;
    	rev=rev*10+x;
    	n=n/10;
    }
    System.out.println(" Reverse of this number is-->"+rev);

	}

}
