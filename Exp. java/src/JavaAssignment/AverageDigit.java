package JavaAssignment;
import java.util.Scanner;
public class AverageDigit {
	public static double avgDigit(int a)
	{
		double count=0;
		double sum=0;
		double avg=0;
		while(a>0)
		{
			sum=sum+a%10;
			count++;
			a=a/10;
		}
		avg=sum/count;
		return avg;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		double average=avgDigit(n);
		System.out.println(" the average of digit of "+n+" is "+average);
	}
}
