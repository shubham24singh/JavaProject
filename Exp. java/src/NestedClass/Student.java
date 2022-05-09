package NestedClass;

public class Student {
String name;
int eid;
double per;
Student(){
}
Student(String name,int eid, double per)
{
	super();
	this.name=name;
	this.eid=eid;
	this.per=per;
}
 public String toString()
 {
	 return name+" id "+eid+" per "+per;
 }
}

