package all;
import java.util.Scanner;
public class Pattern2 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		char ch='a';
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i%2==0)
				{
					System.out.print(ch);
					ch++;
				}
				else {
					System.out.print("*");
				}
			}
			 System.out.println();
		}

	}

}
