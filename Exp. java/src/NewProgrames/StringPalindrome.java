package NewProgrames;

public class StringPalindrome {

	public static void main(String[] args) {
		String st="aba";
		String rt=" ";
		for(int i=0;i<st.length();i++) {
		rt=st.charAt(i)+rt;
		}
		rt=rt.trim();
		System.out.println(rt);
		if(st.equals(rt)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not");
		}
	}
	

}
