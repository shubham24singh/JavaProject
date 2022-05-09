package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class It1 {

	public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add(15);
	a1.add(16);
	a1.add(17);
	a1.add(18);
	a1.add(19);
	System.out.println(a1);
	Iterator i1=a1.iterator();
	while(i1.hasNext())
	{
		System.out.println(i1.next());
	}
	System.out.println(a1);
	}
}
