package CollectionMix;

import java.util.Comparator;

public class Emp{
private int id;
private String name;
Emp(int id,String name)
{
	this.id=id;
	this.name=name;
}
Emp() {
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String toString()
{
	return name;
}
 
}
