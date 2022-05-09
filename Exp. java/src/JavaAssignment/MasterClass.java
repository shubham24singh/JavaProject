package JavaAssignment;

import java.util.Scanner;

public class MasterClass {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println(" Enter your Name");
		 String name=sc.nextLine();
		 System.out.println(" your name is "+name);
		 System.out.println(" first character is " + name.charAt(0));
		 System.out.println(" last character is "+ name.charAt(name.length()-1));
	}
}
