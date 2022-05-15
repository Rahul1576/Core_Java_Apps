package test;
import java.util.*;
@SuppressWarnings("serial")
public class Marks extends Exception
{
	public Marks(String msg)
	{
		super(msg);
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
	try {
		System.out.println("Enter marks of sub1 :");
		int m1=s.nextInt();
		if(m1<0&&m1<100)
		{
			Marks m=new Marks("Invalid marks only b/w 1-100");
			throw m;
		}
		System.out.println("Enter marks of sub2 :");
		int m2=s.nextInt();
		System.out.println("Enter marks of sub3 :");
		int m3=s.nextInt();
		System.out.println("Enter marks of sub4 :");
		int m4=s.nextInt();
		System.out.println("Enter marks of sub5 :");
		int m5=s.nextInt();
		System.out.println("Enter marks of sub6 :");
		int m6=s.nextInt();
		
		System.out.println("m1:"+m1+"\t"+"m2:"+m2+"\t"+"m3:"+m3+"\t"+"m4:"+m4+"\t"+"m5:"+m5+"\t"+"m6:"+m6);
		
		int tot=m1+m2+m3+m4+m5+m6;
		float per=tot/6;
		if(tot>=90)
		{
			System.out.println("Excellent");
		}
		if(tot>=80&&tot<90)
		{
			System.out.println("Grade A");
		}
		
		System.out.println("Total marks :"+tot);
		System.out.println("Percentage :"+per);
	}
		catch(InputMismatchException ex)
		{
			System.out.println("Enter only integer value");	
		}
		catch(Marks m)
		{
			System.out.println(m.getMessage());	
		}
		finally
		{
			s.close();
		}
	}

}
