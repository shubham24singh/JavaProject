package Comaparable;

public class Emp implements Comparable {
String name;
int eid;
double salary;
Emp(){
}
Emp(String name,int eid,double salary)
{
	this.salary=salary;
	this.eid=eid;
	this.name=name;
}
public String toString()
{
	return name;
}
public int compareTo(Object obj)
{
	if(this.eid==((Emp)obj).eid)
{
	return 0;
}
else if(this.eid>((Emp)obj).eid)
{
	return -1;
}
else if(this.eid<((Emp)obj).eid)
{
	return 1;
}
	return eid;
}
}
