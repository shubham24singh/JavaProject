package Comparator;

import java.util.PriorityQueue;

public class PriorituQueve1 {

	public static void main(String[] args) {
		PriorityQueue p1=new PriorityQueue(new MyComparator1());
		p1.offer(100);
		p1.offer(200);
		p1.offer(500);
		p1.offer(600);
		p1.offer(350);
		System.out.println(p1);
		// access element one by one from queue
        while(p1.isEmpty()==false)
        {
        	System.out.println(p1.poll());
        }
	}
}
