package JavaAssignment;
import java.util.Scanner;
public class EqualOrNot {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println(" enter two Integer Values");
        int a=s.nextInt();
        int b=s.nextInt();
        if(a==b)
        {
        	System.out.println("Both are Equal Integers");
        }
        else
        {
        	System.out.println(" Both are not equal integers");
        }
        	
        }
	}

