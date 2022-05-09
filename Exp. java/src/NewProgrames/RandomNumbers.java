package NewProgrames;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
	Random rnum=new Random();
    for(int i=1;i<=20;i++)
    {
    	System.out.println(rnum.nextFloat());
    }
	}
}
