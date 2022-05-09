package Polymorphism;

public class Compiletime {
	public static void add(int a,int b)
	{
		System.out.println(a+b);
	}
 public static void add(int a,int b,int c)
 {
	 System.out.println(a+b+c);
 }
 public static void add(int a)
 {
	 System.out.println(a+10);
 }
	public static void main(String[] args) {
		add(10);
		add(20,30);
		add(10,20,30);

	}

}
