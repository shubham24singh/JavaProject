package pattern;
import java.util.Scanner;
public class E {
 public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
    int n= s.nextInt();
    int m=1;
    for(int i=1;i<=n;i++)
    {
    	for(int j=1;j<=n;j++)
    	{
    		System.out.print(j +" ");
    	}
    	System.out.println(); 
    }
 }
}