package String;

import java.util.Iterator;
import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String ");
		String st=s.nextLine();
		int vc=0;
		int cc=0;
		for (int i = 0; i < st.length(); i++) {
			char ch=st.charAt(i);
			if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z')
			{
				if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					vc++;
				}
				else
				{
					cc++;
				}
			}
		}
		System.out.println("No of vowels :"+vc);
		System.out.println("No of Consonant: "+cc);
	}

}
