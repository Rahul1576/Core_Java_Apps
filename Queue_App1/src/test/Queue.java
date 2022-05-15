package test;
import java.util.*;
public class Queue {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
    System.out.println("====Priority Queue<E>=====");
    PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
    pq.add(new Integer(12));
    pq.add(new Integer(13));
    pq.add(new Integer(14));
    pq.add(new Integer(15));
    System.out.println(pq.toString());
    System.out.println("ArrayDeque<E>");
    ArrayDeque<Integer> ad=new ArrayDeque<Integer>();
    ad.add(new Integer(12));
    ad.add(new Integer(13));
    ad.add(new Integer(14));
    ad.add(new Integer(15));
    System.out.println(ad.toString());
    ad.addFirst(new Integer(11));
    ad.addFirst(new Integer(16));
    System.out.println(ad.toString());
    ad.removeFirst();
    ad.removeLast();
    System.out.println(ad.toString());
	}

}
