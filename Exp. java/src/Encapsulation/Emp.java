package Encapsulation;

public class Emp {
	private String name;
	private int eid;
	private double salary;
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
	public void setSalary(String name)
	{
		this.salary=salary;
	}
	Emp(String name,int eid,double salary){
		this.name=name;
		this.eid=eid;
		this.salary=salary;
	}
	public void work()
	{
		System.out.println(name +" salary as "+ salary );
	}
	}