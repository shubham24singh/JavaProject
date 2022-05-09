package Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class PrintDuplicateitem {

	public static void main(String[] args) {
    ArrayList a1=new ArrayList();
    a1.add(100);
    a1.add(true);
    a1.add(300);
    a1.add(100);
    a1.add(500);
    a1.add(true);
    System.out.println(a1);
    HashSet h1=new HashSet();
    for(int i=0;i<a1.size();i++)
    {
      Object a=a1.get(i);
      if(h1.add(a)==false)
      {
    	  System.out.println(a);
      }
    }

	}

}
