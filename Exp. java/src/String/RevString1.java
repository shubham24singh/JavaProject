package String;

public class RevString1 {
public static void main(String[]args) {
String s1="hello how are you";
String[]s2=s1.split("");
for(int i=0; i<s2.length;i++)
{
  System.out.println(s2[i]);
}
}
}