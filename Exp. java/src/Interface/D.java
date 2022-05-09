package Interface;

public class D extends C{
	public void run() {
		System.out.println("override");
	}

	public static void main(String[] args) {
		C r=new D();//upcasting
		r.run();
		D d1=(D)r;//downcasting
		

	}

}
