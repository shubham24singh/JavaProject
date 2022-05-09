package JavaAssignment;
import java.util.Scanner;
public class Biggest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println(" Enter three Integer Values");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int big=a;
		if(b>big)
		{
			big=b;
		}
		if(c>big)
		{
			big=c;
		}
		System.out.println("biggest no is "+big);
	}

}
