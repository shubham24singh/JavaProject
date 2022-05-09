package Collection;
public class Emp 
{
  String name;
 int eid;
	double salary;
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
	public void setEid(int eid)
	{
		this.eid=eid;
	}
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
    Emp()
	{
	}
	Emp(String name,int eid,double salary)
	{
		this.name=name;
		this.eid=eid;
		this.salary=salary;
	}
}
