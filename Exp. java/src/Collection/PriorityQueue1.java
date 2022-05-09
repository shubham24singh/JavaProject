package Collection;

import java.util.PriorityQueue;

public class PriorityQueue1 {

	public static void main(String[] args) {
    PriorityQueue p1=new PriorityQueue();
    p1.offer(12);
    p1.offer(14);
    p1.offer(16);
    p1.offer(18);
    p1.offer(20);
    p1.offer(22);
    System.out.println(p1);
    System.out.println(p1.peek());
    System.out.println(p1.poll());
    System.out.println(p1);
    System.out.println(p1.peek());
    System.out.println(p1.poll());
    while(p1.isEmpty()==false)
    {
    	System.out.println(p1.poll());
    }
    System.out.println(p1);
    
	}

}
