package CollectionMix;

import java.util.Comparator;

public class ComparatorForTreeset implements Comparator {
	@Override
	public int compare(Object obj1,Object obj2)
	{
		int a1=(Integer)obj1;
		int a2=(Integer)obj2;
		if(a1==a2)
			return 0;
		else if(a1>a2)
			return -1;
		else
			return 1;
	}
}
