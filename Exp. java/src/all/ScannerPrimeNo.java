package all;
import java.util.Scanner;
public class ScannerPrimeNo {

	public static void main(String[] args) 
	{
      Scanner s=new Scanner(System.in);
      System.out.println("Enter A Number");
      int n=s.nextInt();
      int sum=0;
      for(int i=2;i<n;i++)
      {
    	  if(n%i==0)
    	  {
    		  System.out.println("It is not a Prime No.");
    		  sum++;
    		  break;
    	  }
      }
       if(sum==0)
       {
    	   System.out.println(" It is prime no");
       }
	}

}
