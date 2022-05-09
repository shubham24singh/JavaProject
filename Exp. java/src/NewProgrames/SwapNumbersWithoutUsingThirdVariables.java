package NewProgrames;

import java.util.Scanner;

public class SwapNumbersWithoutUsingThirdVariables {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println(" Enter First Number");
     int i=sc.nextInt();
     System.out.println(" Enter second number");
     int j=sc.nextInt();
     i=i+j;
     j=i-j;
     i=i-j;
     System.out.println(i);
     System.out.println(j);

	}

}
