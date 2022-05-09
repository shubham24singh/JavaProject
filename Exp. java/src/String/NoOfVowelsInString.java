package String;

import java.util.Scanner;

public class NoOfVowelsInString  {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println(" Enter the String ");
		String st=s.nextLine();
	    int count=0;
		String v="AEIOUaeiou";
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(v.indexOf(ch)>=0)
				count++;
				
		}
		System.out.println("no of vowels from string is : "+count);
	}

}
