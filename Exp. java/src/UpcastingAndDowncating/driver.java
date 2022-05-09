package UpcastingAndDowncating;

public class driver {

	public static void main(String[] args) {
B obj1=new B();
System.out.println(obj1.j);
System.out.println(obj1.i);
System.out.println(obj1.k);
System.out.println(obj1.l);
obj1.test();
A obj2=obj1;
B obj3=(B)obj2;


		

	}

}
