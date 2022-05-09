package JavaAssignment;
import java.util.Scanner;
public class RangePerfect {
public static boolean isPerfect(int n)
{
	int sum=0;
	for(int i=1;i<n;i++)
	{
		if(n%i==0)
		{
			sum=sum+i;
		}
	}
	return sum==n;
}
	public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the Range :");
     int n=s.nextInt();
     for(int i=1;i<=n;i++)
     {
    	 boolean perfect=isPerfect(i);
    	 if(perfect==true)
    	 {
    		 System.out.println(i);
    	 }
     }
	}

}
