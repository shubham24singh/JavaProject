package Collection;
import java.util.*;
public class ArrayList2 {

	public static void main(String[] args) {
	 ArrayList a1=new ArrayList();
		a1.add(100);
		a1.add(200);
		a1.add("hello");
		a1.add(true);
		System.out.println(a1);
		for(Object i:a1)
		{
			System.out.println(i);
		}
		ArrayList a2=new ArrayList(a1);
		System.out.println(a2);
	}

}
