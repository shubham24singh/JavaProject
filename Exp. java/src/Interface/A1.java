package Interface;

public class A1 implements I1 {
public void test() {
	System.out.println("overridden");
}
public void test(int a)
{
	System.out.println(a);
}
	public static void main(String[] args) {
		A1 a=new A1();
		a.test();
		a.test(10);
		

	}

}
