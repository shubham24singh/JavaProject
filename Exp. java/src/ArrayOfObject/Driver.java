package ArrayOfObject;

public class Driver {

	public static void main(String[] args) {

     Student s1=new Student("Bala",11,18561.25);
     Student s2=new Student("Kala",12,56478.36);
     Student s3=new Student("Sala",145,17865.45);
     Student[] st=new Student[3];
     st[0]=s1;
     st[1]=s2;
     st[2]=s3;
     for(int i=0;i<st.length;i++)
     {
    	 System.out.println("Name: "+st[i].name);
    	 System.out.println("Eid: "+st[i].eid);
    	 System.out.println("Salary: "+st[i].salary);
    	 System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
     }
     

	}

}
