package package2;
class Driver 
{
	public static void main(String[] args) {
    Developer e1=new Developer("Gokul",0,100000.0,"Developer");
    TestEngineer e2=new TestEngineer("Sai",0,100000.12,"Test Engineeer");
    Hr e3=new Hr("Samantha",0,1000005.0,"HR");
    displayDetails(e1);
    displayDetails(e2);
    displayDetails(e3);
 }
	public static void displayDetails(Emp e)
	{
		System.out.println("Name "+ e.getName());
		System.out.println("EID "+ e.getEid());
		System.out.println("Salary "+ e.getSalary());
		System.out.println("Designation "+e.getDesignation());
		e.work();
		if(e instanceof Developer)
		{
			((Developer)e).Code();
		}
		else if(e instanceof TestEngineer )
		{
			((TestEngineer)e).WriteTestCases();
		}
		else if(e instanceof Hr)
		{
		 ((Hr)e).Recruit();	
		}
		System.out.println("-------------------------------------------------");
	}

}
