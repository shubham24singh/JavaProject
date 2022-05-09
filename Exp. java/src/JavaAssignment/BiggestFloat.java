package JavaAssignment;
import java.util.Scanner;
public class BiggestFloat {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println(" Enter Four Integer Values");
		float a=s.nextFloat();
		float b=s.nextFloat();
		float c=s.nextFloat();
		float d=s.nextFloat();
		float big=a;
		if(b>big)
		{
			big=b;
		}
		if(c>big)
		{
			big=c;
		}
		if(d>big)
		{
			big=d;
		}
		System.out.println("biggest no is "+big);
	}

}
