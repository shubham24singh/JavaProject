package all;

    class Factorial 
    {
    public static long getFactorial(int x)
    {
     long sum=1;
     while(x>0)
     {
    	 sum=sum*x;
    	 x--;
     }
     return sum;
    }
	public static void main(String[]args)
	{
		int a=20;
		long factorial=getFactorial(a);
		System.out.println(factorial);
	}
}
