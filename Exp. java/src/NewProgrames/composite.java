package NewProgrames;
 // A number which has more than two factors. if a no. is not a prime then it will be a composite number.1 is neither prime nor composite.
import java.util.Scanner;
public class composite {
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a number");
     int num=sc.nextInt();
     if(num==1)
     {
    	 System.out.println("neither prime nor composite");
     }
     int count = 0;
     for(int i=1;i<=num;i++)
     {
    	 if(num%i==0)
    	 {
    		 count++;
    	 }
     }
     if(count>2)
     {
        System.out.println("composite");
     }
     else
     {
        System.out.println("Prime");
     }
	}
}
