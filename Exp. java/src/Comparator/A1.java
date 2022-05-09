package Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class A1 {
 public static void main(String[] args) {
	ArrayList<Integer> a1=new ArrayList<>();
	a1.add(100);
	a1.add(200);
	a1.add(300);
	a1.add(50);
	a1.add(70);
	System.out.println(" before descending");
	System.out.println(a1);
	Collections.sort(a1,new MyComparator1());
	System.out.println(" After descending");
	System.out.println(a1);
	
}
}
