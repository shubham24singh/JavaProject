package Abstraction;

public class B extends A {
public void run() {
	System.out.println(" run from B");
}
public static void main(String[]args) {
	B obj1=new B();
	obj1.run();
}
}
