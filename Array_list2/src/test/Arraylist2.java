package test;
import java.util.*;
public class Arraylist2 {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
     ArrayList<Integer>al=new ArrayList<Integer>();
     al.add(new Integer(12));
     al.add(new Integer(18));
     al.add(new Integer(11));
     al.add(new Integer(23));
     System.out.println("Display to String()");
     System.out.print(al.toString());
     Integer ele=al.get(2);//getting element from index-2
     System.out.println("The ele at index-2:"+ele);
     al.add(2,new Integer(500));
     System.out.println(al.toString());
     al.remove(2);
     System.out.println(al.toString());
     al.set(2,new Integer(700));
     System.out.println(al.toString());
	}

}
