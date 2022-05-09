package pattern;
import java.util.Scanner;
public class I {
 public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
    int n= s.nextInt();
    for(int i=n;i>=1;i--)
    {
    	for(int j=n;j>=i;j--)
    	{
    		System.out.print(j +" ");
    	}
    	System.out.println(); 
    }
 }

}
