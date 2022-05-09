package Map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class H2 {

	public static void main(String[] args) {
		HashMap h1=new HashMap();
		h1.put(1,"hello");
		h1.put(3, "bye");
		h1.put(4,"Good");
		h1.put(5,"bad");
		System.out.println(h1);
		System.out.println(h1.size());
		System.out.println(h1.containsKey(7));
		System.out.println(h1.containsValue("hello"));
		Set a=h1.keySet();
		for(Object i:a)
		{
			System.out.println(i);
		}
		Collection l=h1.values();
		for(Object b:l)
		{
			System.out.println(b);
		}
		Set<Map.Entry<String,Integer>> s=h1.entrySet();
		for(Map.Entry<String,Integer> b:s)
		{
			System.out.println(b);
		}
		
	}

}
