package JavaAssignment;
import java.util.Scanner;
public class Smallest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println(" Enter three Integer Values");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int small=a;
		if(b<small)
		{
			small=b;
		}
		if(c<small)
		{
			small=c;
		}
		System.out.println("Smallest no is "+small);
	}

}
