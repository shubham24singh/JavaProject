package Array;
import java.util.Iterator;
import java.util.Scanner;
public class ReverseArray {
static int[] readArr()
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size of array");
	int n=s.nextInt();
	int ar[]=new int[n];
	System.out.println("enter "+n+ "element");
	for (int i = 0; i < ar.length; i++) {
		ar[i]=s.nextInt();
	}
	return ar;	
}
static void displayArr(int ar[])
{
	for (int i = 0; i < ar.length; i++) {
		System.out.println(ar[i]);
	}
}
static int[] reverseArr(int ar[])
{
	int[] newArr=new int[ar.length];
	for (int i = ar.length-1; i>=0; i--) {
		int j=0;
		ar[i]=newArr[j];
		j++;
	}
	return newArr;
	
}
	public static void main(String[] args) {
	int x[]=readArr();
	System.out.println("before reversing");
	displayArr(x);
	System.out.println("After Reversing");
	int y[]=reverseArr(x);
	displayArr(y);

	}

}
