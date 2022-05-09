package pattern;
import java.util.Scanner;
public class O {
public static void main(String[]args)
{
   Scanner s=new Scanner(System.in);
   System.out.println("enter the number");
   int n=s.nextInt();
   int k=1;
   for(int i=1;i<=n;i++) 
   {
	 for(int j=1;j<=n;j++)
	 {
		 if(k==10)
		 {
			 k=1;
		 }
		 System.out.print(k+" ");
            k++;
	 }
	 System.out.println();
   }
 }
}
