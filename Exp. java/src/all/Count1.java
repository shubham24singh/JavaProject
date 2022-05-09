package all;

public class Count1 {
	public static int countSpecificNumbers(int m,int n)
	{
	int count=0,temp,flag=0,l;
	if(m>n)
	return -1;
	for(int i=m;i<=n;i++)
	{
		temp=i;
		while(temp>0)
		{
			l=temp%10;
			flag=0;
			if(l==0 || l==2 || l==3 || l==5||l==6||l==7||l==8)
			{
				flag=1;
				break;
			}
			temp=temp/10;
			}
		if(flag==0)
			count++;
   }
		return count;
	}
	public static void main(String[]args)
	{
		int m=100;
		int n=200;
		int count=countSpecificNumbers(m,n);
		System.out.println(count);
	}

}
