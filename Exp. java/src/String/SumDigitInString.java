package String;
import java.util.Scanner;
public class SumDigitInString {

	public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     System.out.println("Enter the String with Digit");
     String st=s.nextLine();
     int sum=0;
     for(int i=0;i<st.length();i++)
     {
    	 char ch=st.charAt(i);
    	 if(ch>='0'&&ch<='9')
    		 sum=sum+ch-48;
     }
     System.out.println("Sum of Digit in a String "+sum);
	}

}
