package CollectionMix;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Arraylist1 {

	public static void main(String[] args) {
	ArrayList<Integer> a1=new ArrayList<>();
	a1.add(100);
	a1.add(200);
	a1.add(300);
	a1.add(400);
	a1.add(500);
	a1.add(19);
	Collections.sort(a1,new ComparatorForArrayList());
	System.out.println(a1);
			

	}

}
