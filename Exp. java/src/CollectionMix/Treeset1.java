package CollectionMix;

import java.util.TreeSet;

public class Treeset1 {
	public static void main(String[] args) {
	TreeSet t=new TreeSet(new ComparatorForTreeset());
	t.add(100);
	t.add(200);
	t.add(500);
	t.add(15);
	t.add(1);
	System.out.println(t);
		
		
		
	}
}
