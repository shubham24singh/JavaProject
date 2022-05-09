package JavaAssignment;

public class BuubleSort1 {
public static void main(String[] args) {
	int a[]= {78,5,6,45,65,23};
	int temp;
	int flag;
	for(int i=0;i<a.length;i++)
	{ 
		flag=0;
		for(int j=0;j<a.length-1-i;j++)
		{
			flag=0;
			if(a[j]>a[j+1])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				flag=1;
			}
			
		}
		if(flag==0)
		{
			break;
		}
		
	}
	for(int k=0;k<a.length;k++)
	{
		System.out.println(a[k]);
	}
}
}
