package DataStructure;

public class Driver1 {

	public static void main(String[] args) {
		MyStack1 ms=new MyStack1(5);
		ms.push(100);
		ms.push(115);
		ms.push(114);
		ms.push(45);
		ms.push(123);
		
		System.out.println(ms);
		ms.push(147);

	}

}
