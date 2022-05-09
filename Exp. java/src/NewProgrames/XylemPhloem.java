package NewProgrames;
//add of external digits is equal to add of internal digits.
import java.util.Scanner;

public class XylemPhloem {
public static String checkXP(int num) {
	int es=0;
	int ms=0;
	es=es+num%10;
	num=num/10;
	while(num>9){
	 ms=ms+num%10;
	 num=num/10;
	}
	es=es+num;
	if(ms==es) {
	    return "Xylem";
	}
	else {
		return "Phloem";
	}
}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println(" Enter the Number");
	int num=sc.nextInt();
	String xp=checkXP(num);
	System.out.println(xp);

	}

}
