package all;
    class Perfect {
	public static void main(String[]args)
	{
		int a = 6;
		int sum=0;
		for(int i=1;i<a;i++)
		{
			if(a%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==a)
		{
			System.out.println("It is a perfect no");
		}
		else
		{
			System.out.println("It  is not a perfect no");
		}
	}
}