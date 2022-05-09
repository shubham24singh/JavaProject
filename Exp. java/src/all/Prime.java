package all;

public class Prime {

	public static void main(String[] args) {
		int a=14;
		int count=0;
		int sum=0;
		for(int i=2;i<a;i++)
		{
			if(a%2==0)
			{
				System.out.println(" It is not Prime Number");
				count++;
				break;
			}
		}
		if(sum==count)
		{
			System.out.println("It is Prime no");
		}

	}

}
