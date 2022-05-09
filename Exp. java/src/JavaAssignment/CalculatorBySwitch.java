package JavaAssignment;

import java.util.Scanner;

public class CalculatorBySwitch {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String yn;
	do{System.out.println("Enter the first Number");
	int x=s.nextInt();
	System.out.println("Enter the Second Number");
	int y=s.nextInt();
	System.out.println(" Enter the Symbol of calculator-->+,-,*,/");
	String sym=s.next();
	int res;
	switch(sym)
	{
	 case("+"):res=x+y;
	          System.out.println(res);
	          break;
	 case("-"):res=x-y;
	           System.out.println(res);
               break;
	 case("*"):res=x*y;
	           System.out.println(res);
	           break;
	 case("/"):res=x/y;
	           System.out.println(res);
	           break;
	 default: System.out.println(" Invalid input ");
	          break;          
	}
	System.out.println("Do you want to continue(Press y for yes n for no)");
	yn =s.next();
	}while(yn.equals("y")||yn.equals("Y"));
	}

}
