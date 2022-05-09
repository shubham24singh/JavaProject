package DataStructure;

public class MyStack1 {

	int capacity=-1,top=-1;
	Object ele[];
	MyStack1(int capacity)
	{
		this.capacity=capacity;
		ele=new Object[capacity];
	}
	boolean push(Object obj)
	{
		if(top==capacity-1)
		{
			System.out.println("Stack overflow");
			return false;
		}
		ele[++top]=obj;
		return true;
	}
	Object pop()
	{
		if(top==-1)
		{
			System.out.println(" Stack underflow");
			return null;
		}
		return ele[top--];
	}
	Object peek()
	{
		if(top==-1)
		{
			System.out.println(" Stack is underflow");
			return null;
		}
		return ele[top];
	}
public String toString()
{
	String st="[";
	for(int i=0;i<=top;i++)
	{
		st=st+ele[i];
		if(i<top)
			st=st+",";
	}
	return st+"]";
}
}