package Comparator;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Treeset1 {

	public static void main(String[] args) {
		TreeSet t1=new TreeSet(new MyComparator1());
		t1.add(100);
		t1.add(40);
		t1.add(70);
		t1.add(114);
		System.out.println(t1);
		for(Object i:t1)
		{
			System.out.println(i);
		}
	}
}
