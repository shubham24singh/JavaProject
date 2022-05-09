package all;
import java.util.Scanner;
public class DiceProbability {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Probability Number");
     int prb=s.nextInt();
     int count=0;
     for(int i=1;i<=6;i++)
     {
    	 for(int j=1;j<=6;j++)
    	 {
    		 if(i+j==prb)
    		 {
    			 count++;
    		 }
    	 }
     }
     System.out.println(count);
	}

}
