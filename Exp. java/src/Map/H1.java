package Map;
import java.util.HashMap;
public class H1 {

	public static void main(String[] args) {
		HashMap h1=new HashMap();
		h1.put(1,"Naveen");
		h1.put(2,"Praveen");
		h1.put(3,"Muveen");
		h1.put(4,"Saveen");
		System.out.println(h1);
		h1.put(2,"Taveen");
		System.out.println(h1);
		h1.remove(3);
		System.out.println(h1);
		h1.clear();
		System.out.println(h1);
		System.out.println(h1.size());	
	}
}
