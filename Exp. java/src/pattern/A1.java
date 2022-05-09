package pattern;

public class A1 {

	public static void main(String[] args) {
		char a ='A';
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i%2==1)
				{
					System.out.print(j);
				}
				else
				{
					System.out.print(a);
					a++;
				}
			}
	        System.out.println("                ");
	        a='A';
		}
	}
}
