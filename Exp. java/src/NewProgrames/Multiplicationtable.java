package NewProgrames;

import java.util.Scanner;

public class Multiplicationtable {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number which you want multiplication table");
	int num=sc.nextInt();
	for(int i=1;i<=10;i++)
	{
		System.out.println(num+" * "+i+"="+num*i);
	}

	}

}
