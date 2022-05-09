package Collection;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import Comparator.MyComparator1;

import Comparator.MyComparator1;

public class TreeSet1 {

	public static void main(String[] args) {
	TreeSet t1=new TreeSet(new MyComparator1());
	t1.add(200);
	t1.add(120);
	t1.add(110);
	t1.add(20);
	t1.add(10);
	
	System.out.println(t1);
	

	}

}
