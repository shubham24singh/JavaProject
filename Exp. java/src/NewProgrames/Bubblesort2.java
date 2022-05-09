package NewProgrames;

public class Bubblesort2 {
	public static void main(String[] args) {
		int []a= {1,2,3,4,5};
		int flag;
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				flag=0;
				if(a[j]<a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
				}
				if(flag==0)
				{
					break;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
