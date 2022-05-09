package package1;

    class Driver1 {

	public static void main(String[] args) {
		First obj1=new First("BALLAYYA",0,100006.50,"Developer");
		First obj2=new First("Shanto",0,10000.36,"Tester");
		displayDetails(obj1);
		displayDetails(obj2);
		
	}
		public static void displayDetails(First e)
		{
			System.out.println("Name "+ e.name);
			System.out.println("EID "+ e.eid);
			System.out.println("Salary "+ e.salary);
			System.out.println("Designation "+e.designation);
			e.work();
		}
	}
