package Array;

public class C {

	public static void main(String[] args) {
		int[]a= {4,2,5,7,8,64,25,78,14,57,65};
		int large=4;
		int small=4;
//		largest
		for(int i=0;i<a.length;i++)
        {
	       if(a[i]>large)
	       {
	    	   large=a[i];
	       }
        }
//		smallest
		for(int i=0;i<a.length;i++)
		{
			if(small>a[i])
			{
				small=a[i];
			}
		}
		System.out.println(large);
		System.out.println(small);

	}

}
