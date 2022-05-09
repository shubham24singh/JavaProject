package Collection;
import java.util.ArrayList;
public class ArrayList1 {

	public static void main(String[] args) {
     ArrayList a1=new ArrayList();
     a1.add(100);
     a1.add(10);
     a1.add(100);
     a1.add("hello");
     a1.add(10.5);
     System.out.println(a1);
     System.out.println(a1.size());
     ArrayList a2=new ArrayList();
     a2.add("bye");
     a2.add(56);
     a2.add(55.5);
     a2.add(true);
     System.out.println(a2);
     a2.addAll(a1);
     System.out.println(a2);
     System.out.println(a1.get(3));
     a1.remove(2);
     System.out.println(a1);
     
     
	}

}
