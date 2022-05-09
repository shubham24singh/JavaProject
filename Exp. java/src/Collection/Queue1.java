package Collection;

import java.util.LinkedList;

public class Queue1 {

	public static void main(String[] args) {
	LinkedList l1=new LinkedList();
	l1.offer(100);
	l1.offer(200);
	l1.offer(120);
	l1.offer(10);
	l1.offer(101);
	System.out.println(l1);
	System.out.println(l1.get(2));
	System.out.println(l1.peek());
	while(l1.isEmpty()==false)
	{
		System.out.println(l1.poll());
	}
	System.out.println(l1.isEmpty());

	}

}
