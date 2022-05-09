package Encapsulation;
public class Driver {
	public static void main(String[] args) {
	Emp e1=new Emp("Suresh",1,8000.0);
	Emp e2=new Emp("Mohit",2,16000.0);
	Emp e3=new Emp("Rohit",3,5000.0);
	displayDetails(e1);
	displayDetails(e2);
	displayDetails(e3);
	}
	public static void displayDetails(Emp e)
	{
		System.out.println("name : "+e.getName());
		System.out.println("eid :"+e.getEid());
		System.out.println("salary :"+e.getSalary());
		e.work();
		System.out.println("-------------------------------------------------------------------------------");
	}
	}