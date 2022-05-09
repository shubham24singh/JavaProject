package all;
import java.util.Scanner;
public class ScannerPerfectNo {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println(" Enter A Number");
	int n=s.nextInt();
	int sum=0;
	for(int i=1;i<=n;i++)
	{
	 if(n%i==0)
	 {
		 sum=sum+i;
	 }
	}
	 if(sum==n)
	 {
		 System.out.println(" It is Perfect Number");
	 }
	 else
	 {
		 System.out.println(" It is not a Perfect Number");
	 }
	}

}
