package NewProgrames;

import java.util.Scanner;

public class Palindrome {
	public static boolean isPalindrome(int num) {
		int temp=num;
		int rev=0;
		while(num!=0)
		{
			int n=num%10;
			rev=rev*10+n;
			num=num/10;
		}
		return temp==rev;
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the range from 1 to");
	int num=sc.nextInt();
	for(int i=1;i<=num;i++) {
		boolean palindrome=isPalindrome(i);
		if(palindrome==true) {
			System.out.println("Palindrome-->"+i);
		}
	}

	}

}
