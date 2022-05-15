package test;
import java.util.*;
public class Vector1 {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
    Vector<Integer> v=new Vector<Integer>();
    System.out.println("default capacity:"+v.capacity());
    System.out.println("size:"+v.size());
    v.addElement(new Integer(1));
    v.addElement(new Integer(2));
    v.addElement(new Integer(3));
    v.addElement(new Integer(4));
    v.addElement(new Integer(5));
    v.addElement(new Integer(6));
    v.addElement(new Integer(7));
    v.addElement(new Integer(8));
    v.addElement(new Integer(9));
    System.out.println("Using toString()");
    System.out.println("capacity:"+v.capacity());
    System.out.println("size:"+v.size());
    System.out.println(v.toString());
    
    v.addElement(new Integer(10));
    System.out.println("Using toString()");
    System.out.println("capacity:"+v.capacity());
    System.out.println("size:"+v.size());
    System.out.println(v.toString());
                                         
    v.addElement(new Integer(11));
    System.out.println("Using toString()");
    System.out.println("capacity:"+v.capacity());
    System.out.println("size:"+v.size());
    System.out.println(v.toString());
    
    System.out.println("\nDisplay using Enumeration<E>");
    Enumeration<Integer>e=v.elements();
    while(e.hasMoreElements()) {
    System.out.print(e.nextElement());
    }
    System.out.println("\nDisplay using List Iterator<E>");
    ListIterator<Integer>li=v.listIterator();
    System.out.println("Forward");
    while(li.hasNext())
    {
    	System.out.print(li.next()+" ");
    }
    System.out.println("\nBackward");
    while(li.hasPrevious())
    {
    	System.out.print(li.previous()+" ");
    }
	}
}