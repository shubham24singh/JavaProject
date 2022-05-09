package String;

public class B {

	public static void main(String[] args) {
		char[]a= {'d','e','e','p'};
		String b=new String(a);
		System.out.println(b);
		String c="java";
		String e= new String("java");
        System.out.println(c==e);
//		comparing objects
//      comparing values from below
        System.out.println(c.equals(e));
        String f=new String("Java");
        System.out.println(c.equalsIgnoreCase(f));
         System.out.println(c.compareTo(e));

         System.out.println(f.compareTo(c));
	}

}
