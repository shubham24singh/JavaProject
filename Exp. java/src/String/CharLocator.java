package String;
import java.util.Scanner;
public class CharLocator {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println(" Enter the String");
        String st=s.nextLine();
        int uc=0,lc=0,dc=0,spc=0;
        for(int i=0;i<st.length();i++)
        {
        	char ch=st.charAt(i);
        	if(ch>='A'&& ch<='Z')
        		uc++;
        	else if(ch>='a'&& ch<='z')
        		lc++;
        	else if(ch>='0'&& ch<='9')
        		dc++;
        	else
        		spc++;
        }
        System.out.println("no. of uppper case character is: "+ uc);
        System.out.println("no. of lower case character is: "+ lc);
        System.out.println("no. of digit  character is: "+ dc);
        System.out.println("no. of special character is: "+ spc);  
	}
}