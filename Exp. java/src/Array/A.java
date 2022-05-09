package Array;

public class A {
public static int toSumArray(int[]b)
{
	int sum=0;
	for(int i=0;i<b.length;i++)
	{
		sum=sum+b[i];
	}
	return sum;
}
public static void main(String[]args) {
	int[]a= {1,5,7,9};
	int b=toSumArray(a);
	System.out.println(b);
}
}
