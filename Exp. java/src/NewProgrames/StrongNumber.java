package NewProgrames;
//sum of factorial of its individual digits is equal to that number itself.
import java.util.Scanner;
public class StrongNumber {
public static boolean isStrong(int num) {
	int temp=num;
	int sum=0;
      while(num!=0) {
	 int n=num%10;
	 sum=sum+factorial(n);
	 num=num/10;
   } 
	   return sum==temp;
}
public static int factorial(int n)
{
	int fact=1;
	for(int i=1;i<=n;i++) {
		fact=fact*i;
	}
	return fact;
}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Range Number from 1");
	int num=sc.nextInt();
	for(int i=1;i<=num;i++) {
		boolean strong=isStrong(i);
		if(strong==true) {
			System.out.println("Strong--> "+i);
		}
	}
	
	
	
	}
}
