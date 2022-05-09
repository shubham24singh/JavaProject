package String;
import java.util.Scanner;
public class A {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=s.nextLine();
		char[]s2= s1.toCharArray();
		int count=0;
		for(int i=0;i<s2.length;i++)
		{
			if(s2[i]=='a')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
