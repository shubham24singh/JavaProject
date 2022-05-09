package Exception;

import java.io.FileNotFoundException;

public class MyException extends RuntimeException {

	public static void main(String[] args) throws Exception {
	 System.out.println("main handled");
	 System.out.println("from main");
	 if(10<20)
	 {
		 throw new Exception();
	 }

	}

}
