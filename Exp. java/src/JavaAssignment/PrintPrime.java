package JavaAssignment;

public class PrintPrime {
	public static boolean isPrime(int a)
	{
		int count=0;
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
			   count++;
			   break;
			}
		}
		return count==0;
	}

	public static void main(String[] args) {
		int[]a= {1,3,5,2,4,6,7,9,11,10,12};
		for(int i=0;i<a.length;i++)
		{
			boolean p=isPrime(a[i]);
		    if(p==true)
		 {
			 System.out.println(a[i]);
		 }
		}
			
}
 }