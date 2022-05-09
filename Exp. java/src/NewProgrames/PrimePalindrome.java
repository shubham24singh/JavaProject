package NewProgrames;

import java.util.Scanner;

public class PrimePalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int temp=num;
		int rev=0;
		int count=0;
		while(num!=0)
		{
			int x=num%10;
			rev=rev*10+x;
			num=num/10;	
		}
		if(rev==temp)
		{
			for(int i=2;i<rev;i++)
			{
				if(rev%i==0)
				{
					System.out.println(" Not a prime palindrome");
					count++;
					break;
					
				}
			}
			if(count==0) {
				System.out.println("It is Prime Palindrome");
			}
		}
		

	}

}
