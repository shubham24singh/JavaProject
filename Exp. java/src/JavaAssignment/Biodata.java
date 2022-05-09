package JavaAssignment;
import java.util.Scanner;
public class Biodata {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your Name");
	String name=sc.nextLine();
	System.out.println("Enter Your Phone Number");
	long ph=sc.nextLong();
	System.out.println(" Enter your 10th Percentage");
	double per10=sc.nextDouble();
	System.out.println(" Enter your 12th Percentage");
	double per12=sc.nextDouble();
	System.out.println(" Enter your avg degree percentage");
	double avgdeg=sc.nextDouble();
	System.out.println("Name: "+name);
	System.out.println("PHNO: "+ph);
	System.out.println("10TH PERCENTAGE: "+per10);
	System.out.println("12TH PERCENTAGE: "+per12);
	System.out.println("AVERAGE OF DEGREE PERCENTAGE: "+avgdeg);
	}

}
