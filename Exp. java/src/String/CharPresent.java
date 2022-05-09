package String;

public class CharPresent {

	public static void main(String[] args){
		String s1="bbcccddd";
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.indexOf('a')>=0)
			{
				count++;
			}
		}
		if(count>0)
		{
			System.out.println("Character a is present");
		}
		else
		{
			System.out.println("Charactor a is not present");
		}
	}
}
