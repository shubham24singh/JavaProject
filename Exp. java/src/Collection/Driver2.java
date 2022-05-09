package Collection;

import java.util.ArrayList;

public class Driver2 {

	public static void main(String[] args) {
		Emp1 e1=new Emp1("SaiBaba",2,100000.0);
		Emp1 e2=new Emp1("Ram",1,80000.0);
		Emp1 e3=new Emp1("Shyam",3,90000.0);
		ArrayList a1=new ArrayList();
		a1.add(e1);
		a1.add(e2);
		a1.add(e3);
		System.out.println(a1);
	}
}
