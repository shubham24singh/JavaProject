package CollectionMix;

import java.util.Comparator;

public class ComparatorForEmp implements Comparator {

public int compare(Object o1,Object o2) {
		 Emp e1=(Emp)o1;
		 Emp e2=(Emp)o2;
		 if(e1.getId()==e2.getId())
				return 0;
			else if(e1.getId()>e2.getId())
				return 1;
			else
				return -1;
			 
}

}
