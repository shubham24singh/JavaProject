package Array;

public class samllest {
public static void main(String[]args) {
	int[]a= {24,12,11,45};
	int smallest=a[0];
	for(int i=1; i<a.length;i++)
	{
		if(a[i]<smallest)
		{
			smallest=a[i];
		}
	}
	System.out.println(smallest);
}
}
