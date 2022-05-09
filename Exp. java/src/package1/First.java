package package1;

 class First
 {
	static int count=1;
    String name;
    int eid;
    double salary;
    String designation;
    First()
    {
    	
    }
    First(String name,int eid, double salary,String designation)
    {
    	this.name=name;
    	this.eid=count++;
    	this.salary=salary;
    	this.designation=designation;
    }
    public void work()
    {
    	System.out.println(name+" is working as "+designation);
    }
}