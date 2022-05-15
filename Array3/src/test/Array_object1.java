package test;
public class Array_object1 {
	public static void main(String[] args) {
     Object o[]=new Object[3];
     o[0]=new Integer(123);
     o[1]=new String("Hyd");
     o[2]=new Product("A11","Mouse",1200,12);
     System.out.println("Display from object Array");
     for(Object k:o)
     {
         System.out.println(k.toString());
     }
	}
}
//not run