package test;
import java.util.*;
public class DemoSet1 {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
try(s;)
{
	try {
		Set<Integer>st=null;
		System.out.println("Choice");
		System.out.println("1.HashSet\n2.LinkedHashSet\n3.TreeSet");
		int choice =s.nextInt();
		switch(choice)
		{
		case 1:
			st=new HashSet<Integer>();
			break;
		case 2:	
			st=new LinkedHashSet<Integer>();
			break;
		case 3:
			st=new TreeSet<Integer>();
			break;
		default:
			System.out.println("Invalid choice");
			System.exit(0);
		}//end switch
    System.out.println("Enter the no of elements to added to set<E>");
    int n=s.nextInt();
    System.out.println("Enter "+n+"elements");
    for(int i=1;i<=n;i++)
    {
    	st.add(new Integer(s.nextInt()));
    }
    System.out.println("Display using toString()");
    System.out.println(st.toString());
	}catch(Exception e) {e.printStackTrace();}
}
	}

}
