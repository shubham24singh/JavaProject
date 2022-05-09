package String;

public class S1 {

	public static void main(String[] args) {
     int b=10;
     String s1="Ujjwal";
     String s2=String.valueOf(b);
     System.out.println(s1+s2);
     char[] a= {'a','b','c','d'};
     String s3=String.valueOf(a);
     System.out.println(s3);
     char[] ch2=s3.toCharArray();
     System.out.println(ch2[0]);
     char[] ch3= {'c','f','g','k'};
     String s4=new String(ch3);
     System.out.println(s4);
     String s5="Bengaluru";
     System.out.println(s5.concat(" In Karnataka"));
     s5=s5.concat(" -560076");
     System.out.println(s5);
     String s6=s5.substring(2);
     System.out.println(s6);
     String s7=s5.substring(1, 4);
     System.out.println(s7);
     String s8="qtm";
     s8=s8.replace('q','B');
     System.out.println(s8);
     String s9="  bye   ";
     s9=s9.trim();
     System.out.println(s9);
     String s10="java is a language";
     String[] s11=s10.split("");
     for(int i=0;i<s11.length;i++)
     {
    	 System.out.println(s11[i]);
     }	
	}
}
