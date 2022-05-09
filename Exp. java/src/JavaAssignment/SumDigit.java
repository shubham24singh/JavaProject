package JavaAssignment;
import java.util.Scanner;
public class SumDigit {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println(" Enter the number");
		int n=s.nextInt();
		int sumDigit=sumDigit(n);
		System.out.println(" sum of digit of "+ n+" is "+ sumDigit);
	}
		public static int sumDigit(int a)
		{
			int sum=0;
			while(a>0)
			{
				sum=sum+a%10;
				a=a/10;
			}
			return sum;
		}
		

	}

