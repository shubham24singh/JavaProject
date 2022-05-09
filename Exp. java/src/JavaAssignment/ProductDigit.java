package JavaAssignment;
import java.util.Scanner;
public class ProductDigit {
	public static int productDigit(int a)
	{
		int p=1;
		while(a>0)
		{
			int m=a%10;
			p=p*m;
			a=a/10;
		}
		return p;
	}
	public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 System.out.println(" Enter the Nmuber");
	 int n=s.nextInt();
	 int c=productDigit(n);
	 System.out.println(" product of digit of "+n+" is "+c);
	}

}