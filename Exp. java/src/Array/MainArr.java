package Array;
import java.util.Scanner;
public class MainArr {
static int[] readArr() {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size of Array");
	int n=s.nextInt();
	int ar[]=new int[n];
	System.out.println("enter "+ n +" elements");
	for(int i=0;i<ar.length;i++)
	{
		ar[i]=s.nextInt();
	}
	return ar;
	}
static void displayArr(int ar[])
{
	for(int i=0;i<ar.length;i++)
	{
		System.out.println(ar[i]);
	}
}
static int productOfArray(int ar[])
{
	int product=1;
	for(int i=0;i<ar.length;i++)
	{
		product=product*ar[i];
	}
	return product;
}

	public static void main(String[] args) {
		int x[]=readArr();
		System.out.println("user entered array element:");
		displayArr(x);
		int prod=productOfArray(x);
		System.out.println(" Product of Array element is "+prod);
		
		

	}

}
