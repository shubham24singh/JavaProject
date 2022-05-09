package all;

    class Power {
    public static int getPower(int x,int n)
    {
    	int sum=1;
    	for(int i=1;i<=n;i++)
    	{
    		sum=sum*x;
    	}
    	return sum;
    }

	public static void main(String[] args) {
		int x=8;
		int n=3;
		int power=getPower(x,n);
		System.out.println(power);
	}
}
