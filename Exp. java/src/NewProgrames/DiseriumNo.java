package NewProgrames;
import java.util.Scanner;
public class DiseriumNo {
public static boolean isDiserium(int n)
{
	int temp=n;
	int count=digit(n);
	int sum=0;
	while(n>0){
		int x=n%10;
		sum=sum+power(x,count);
		count--;
		n=n/10;
	}
	return sum==temp;
}
public static int digit(int n){
	int count=0;
	do {
		int x=n%10;
		count++;
		n=n/10;
	}while(n!=0);
	return count;
}
public static int power(int n,int p){
	int power=1;
	while(p>0){
	  power=power*n;
	  p--;
	}
	return power;
}
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int num=sc.nextInt();
    boolean diserium=isDiserium(num);
    if(diserium==true)
    {
    	System.out.println(num+ " is a diserium no");
    }
    else {
    	System.out.println(num+ " is not a diserium no");
    }
	}
}
