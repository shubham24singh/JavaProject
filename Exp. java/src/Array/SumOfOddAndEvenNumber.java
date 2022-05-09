package Array;
import java.util.Scanner;
public class SumOfOddAndEvenNumber {
 static int[] readArr()
 {
	 Scanner s=new Scanner(System.in);
	 System.out.println(" enter the size of Array ");
	 int n=s.nextInt();
	 int ar[]=new int[n];
	 System.out.println("Enter "+n+" Element");
	 for(int i=0;i<ar.length;i++)
	 {
		 ar[i]=s.nextInt();
	 }
      return ar;
 }
 public static void displayArr(int ar[])
 {
	 for(int i=0;i<ar.length;i++)
	 {
		 System.out.println(ar[i]);
	 }
 }
 public static int diffOddEven(int ar[])
 {
	 int sumeven=0;
	 int sumodd=0;
	 int sumOddEven=sumeven-sumodd;
	 for (int i = 0; i < ar.length; i++) {
		if(ar[i]%2==0)
			sumeven=sumeven+ar[i];
		else
			sumodd=sumodd+ar[i];
	}
	return sumOddEven;
	 
 }
	public static void main(String[] args) {
		int x[]=readArr();
		displayArr(x);
		int diff=diffOddEven(x);
		System.out.println("diff of sum of odd and sum of even in array is "+diff);

	}

}
