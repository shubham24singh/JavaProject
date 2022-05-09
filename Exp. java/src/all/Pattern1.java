package all;
import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) 
	{
	 Scanner s=new Scanner(System.in);
	 System.out.println("ENTER A NUMBER");
	 int a=s.nextInt();
	 for(int i=0;i<a;i++)
	 {
		 for(int j=0;j<a;j++)
		 {
			 System.out.print("*");
			 
		 }
		 System.out.println();
	 }
		
	}

}
