package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList3 {

	public static void main(String[] args) {
    ArrayList a1=new ArrayList();
    a1.add(100);
    a1.add(110);
    a1.add(10);
    a1.add(120);
    a1.add(150);
    Collections.sort(a1);
    System.out.println(a1);
    Collections.reverse(a1);
    System.out.println(a1);

	}

}
