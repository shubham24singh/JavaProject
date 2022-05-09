package Collection;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
class Driver1 
{
	static Scanner s=new Scanner(System.in);
	static ArrayList<Emp> e=new ArrayList<>();
	static ArrayList<Emp> e2=new ArrayList<>(e);
	public static void addEmployee()
	{
	  System.out.println("Enter a name of Employee");
	  String name=s.nextLine();

	  System.out.println("Enter Eid");
	  int eid=s.nextInt();

	  System.out.println("Enter Salary");
	  double salary=s.nextDouble();

	  Emp e1=new Emp(name,eid,salary);
	  e.add(e1);
	  System.out.println("Employee added Succesfully");
	}
	public static void displayDetails()
	{
	}
    public static void searchEmployee()
	{

	}
	public static void deleteEmployee()
	{

	}
    public static void displayDetailsAscSal()
	{

	}


	public static void main(String[] args)
	{
      System.out.println(" Press 1 to add/create an Employee");
	  System.out.println(" Press 2 to display details of all Employees");
	  System.out.println(" Press 3 to seach an Employee based on name");
	  System.out.println(" Press 4 to delete an Employee based on eid;");
	  System.out.println(" Press 5 to display the Employee details in ascending order of salary");
	  int choice1=s.nextInt();
	  if(choice1==1)
	  {
		  addEmployee();
	  }
	  else if (choice1==2)
	  {
		  displayDetails();
	  }
	  else if (choice1==3)
	  {
		  searchEmployee();
	  }
	  else if (choice1==4)
	  {
		  deleteEmployee();
	  }
      else if (choice1==5)
      {
		  displayDetailsAscSal();
      }
	  
     

	}
}



