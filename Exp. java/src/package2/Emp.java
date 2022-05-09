package package2;

    class Emp {
    static int count=1;
    private String name;
    private int eid;
    private double salary;
    private String designation;
    public String getName()
    {
    	return name;
    }
    public void setName(String name)
    {
    	this.name=name;
    }
    public int getEid()
    {
    	return eid;
    }
    public double getSalary()
    {
    	return salary;
    }
    public void setSalary(double salary)
    { 
    	if(salary>this.salary)
    	{
    		this.salary=salary;
    	}
    }
    public String getDesignation()
    {
    	return designation;
    }
	Emp() 
	{
	}
	Emp(String name,int eid,double salary,String designation)
	{
		this.name=name;
		this.eid=count++;
		this.salary=salary;
		this.designation=designation;
	}
	public void work()
	{
		System.out.println(name +" is working as "+designation);
	}
}
