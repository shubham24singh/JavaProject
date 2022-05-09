package pattern;
import java.util.Scanner;
public class J {
 public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
    int n= s.nextInt();
    for(int i=1;i<=n;i++)
    {
    	for(int j=i;j>=1;j--)
    	{
    		System.out.print((char)(j+64) +" ");
    	}
    	System.out.println(); 
    }
 }

}
