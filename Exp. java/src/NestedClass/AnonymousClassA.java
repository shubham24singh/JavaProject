package NestedClass;

public class AnonymousClassA {

	public static void main(String[] args) {
	Student std1=new Student("Ramesh",1,79.65);
	System.out.println(std1);
	Student std2=new Student("Kalesh",3,49.65) {
		public String toString()
		{
			return " My Name is "+name+" id is "+eid+" per is "+per;
		}
	};
	System.out.println(std2);
	Student std3=new Student("Suresh",5,69.65){
		  public String toString()
		  {
			  return name+ " id is "+eid+" per is "+per; 
		  }
			};
			System.out.println(std3);

	}

}
