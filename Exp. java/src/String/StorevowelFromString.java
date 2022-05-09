package String;
import java.util.Scanner;
public class StorevowelFromString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println(" Enter the String ");
		String st=s.nextLine();
		String n="";
		String v="AEIOUaeiou";
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(v.indexOf(ch)>=0)
				n=n+ch;		
		}
		System.out.println("removing vowels from string is : "+n);
	}

}
