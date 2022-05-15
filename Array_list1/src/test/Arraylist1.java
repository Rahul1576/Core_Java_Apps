package test;
import java.util.*;
public class Arraylist1 {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
     ArrayList<Integer>al=new ArrayList<Integer>();
     al.add(new Integer(12));
     al.add(new Integer(18));
     al.add(new Integer(11));
     al.add(new Integer(23));
     System.out.println("Display to String()");
     System.out.print(al.toString());
     System.out.println("\nDisplay using Iterator<E>");
     Iterator<Integer>it=al.iterator();
     while(it.hasNext())
     {
    	 System.out.print(it.next()+" ");
     }
     System.out.println("\n Display using Spliterator<E>");
     Spliterator<Integer>sp=al.spliterator();//cursor object
     sp.forEachRemaining((k)->
     {
     System.out.print(k.toString()+" ");
     });
     System.out.println("\n Display using forEach()");
     al.forEach((z)->{
    	 System.out.print(z.toString()+" ");
     });
	}

}
