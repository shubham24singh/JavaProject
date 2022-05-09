package JavaAssignment;
import java.util.Scanner;
public class EvenOrOddwithoutmodulous {

	public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 System.out.println(" Enter the value");
     int a=s.nextInt();
     if((a/2)*2==a)
     {
    	 System.out.println(a +" is a even no");
     }
     else
     {
    	 System.out.println(a +" is not a Odd no");
     }
	}

}
