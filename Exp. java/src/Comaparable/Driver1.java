package Comaparable;
import java.util.ArrayList;
import java.util.Collections;
public class Driver1 {
public static void main(String[] args)
{
	Emp e1=new Emp("Sai",3,100000.0);
	Emp e2=new Emp("Shakti",1,90000.0);
	Emp e3=new Emp("Vedha",2,80000.0);
	ArrayList a1=new ArrayList();
	a1.add(e1);
	a1.add(e2);
	a1.add(e3);
	System.out.println(a1);
	Collections.sort(a1);
	System.out.println(a1);	
}
}
