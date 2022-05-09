package CollectionMix;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList2 {

	public static void main(String[] args) {
	Emp e1=new Emp(1,"Satish");
	Emp e2=new Emp(4,"Rajesh");
	Emp e3=new Emp(5,"Mahesh");
	Emp e4=new Emp(2,"Mangesh");
	Emp e5=new Emp(7,"Tahir");
	ArrayList a1=new ArrayList();
	a1.add(e1);
	a1.add(e2);
	a1.add(e3);
	a1.add(e4);
	a1.add(e5);
	Collections.sort(a1,new ComparatorForEmp());
	System.out.println(a1);
	

	}

}
