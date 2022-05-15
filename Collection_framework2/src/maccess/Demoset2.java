package maccess;
import test.*;
import java.util.*;
public class Demoset2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
     try(s;)
     {
    	 try {
    		 Set<BookData>st=null;
    			System.out.println("Choice");
    			System.out.println("1.HashSet\n2.LinkedHashSet\n3.TreeSet");
    			System.out.println("Enter choice");
    			int choice =Integer.parseInt(s.nextLine());
    			switch(choice)
    			{
    			case 1:
    				st=new HashSet<BookData>();
    				break;
    			case 2:	
    				st=new LinkedHashSet<BookData>();
    				break;
    			case 3:
    				st=new TreeSet<BookData>();
    				break;
    			default:
    				System.out.println("Invalid choice");
    				System.exit(0);
    			}
    			System.out.println("Enter the no. of book to be added to set<E>");
    			int n=Integer.parseInt(s.nextLine());
    			System.out.println("Enter "+n+"BookDetails");
    		    for(int i=1;i<=n;i++)
    		    {
    		    	System.out.println("enter the book code");
    		    	String bCode=s.nextLine();
    		    	System.out.println("enter the book name");
    		    	String bName=s.nextLine();
    		    	System.out.println("enter the book author");
    		    	String bAuthor=s.nextLine();
    		    	System.out.println("enter the book price");
    		    	float bPrice=Float.parseFloat(s.nextLine());
    		    	System.out.println("enter the book Qty");
        			int bQty=Integer.parseInt(s.nextLine());
        			st.add(new BookData(bCode,bName,bAuthor,bPrice,bQty));
    		    }
    		    System.out.println("Display using Iterator<E>");
    		    Iterator<BookData>it=st.iterator();
    		    while(it.hasNext()) {
    		    	BookData bd=(BookData)it.next();
    		    	   System.out.println(bd.toString());	
    		    }
    		    System.out.println("Display using Spliterator<E>");
    		    Spliterator<BookData>sp=st.spliterator();
    		    sp.forEachRemaining((k)->{
    		    BookData bd=(BookData)k;
    		    System.out.println(bd.toString());
    		    });
    		    System.out.println("Display using forEach()");
    		    st.forEach((z)->{
    		    	BookData bd=(BookData)z;
    		    	   System.out.println(bd.toString());
    		    });
    	 }catch(Exception e) {e.printStackTrace();}
     }
   }
}