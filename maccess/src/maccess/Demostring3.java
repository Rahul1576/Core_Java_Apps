package maccess;
import java.util.*;
public class Demostring3 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1st string :");
		String s1=s.nextLine().trim();
		System.out.println("Enter 2nd string :");
		String s2=s.nextLine().trim();
		System.out.println("=====equals()========");
		boolean k=s1.equalsIgnoreCase(s2);
		if(k)
		{
			System.out.println("String are equal");
			
		}
		else
		{
			System.out.println("String are not equal");
		}
		
		System.out.println("===========Compare to()=====");
		int z=s1.compareToIgnoreCase(s2);
		if(z==0)
		{
			System.out.println("String are equal");
		}
		else
		{
			System.out.println("String are not equal");
		}
		
		s.close();
	}

}
