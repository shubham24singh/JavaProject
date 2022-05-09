package Exception;

public class E1 {
	public static void test()
	{
		int a=10;
		int b=0;
		System.out.println(a/b);
	}

	public static void main(String[] args)  {
		System.out.println("from main()");
		try {
			 test();	
		}
		catch(ArithmeticException a)
		{
			System.out.println("handled");
		}
		
       
 
	}

}
