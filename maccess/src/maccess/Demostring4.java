package maccess;
public class Demostring4 {

	public static void main(String[] args) 
	{
     String s1=new String("java");
     String s2=new String("Java");
     String s3="java";
     String s4="java";
     System.out.println("New operator process");
     if(s1==s2)
     {
    	 System.out.println("Strings are equal");
    	 
     }
     else
     {
    	 System.out.println("Strings are not equal");
     }
     
     System.out.println("String literals process");
     if(s3==s4)
     {
    	 System.out.println("Strings are equal");
     }
     else
     {
    	 System.out.println("Strings are not equal"); 
     }
	
	}

}
