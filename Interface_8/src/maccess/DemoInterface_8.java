package maccess;
import test.*;
import java.util.*;
public class DemoInterface_8 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no 1 :");
		int v1=s.nextInt();
		System.out.println("Enter no 2 :");
		int v2=s.nextInt();
		System.out.println("====choice=======");
		System.out.println("1.Greater\n2.Smaller");
		System.out.println("Enter Choice");
		int choice=s.nextInt();
		switch(choice)
		{
		case 1:
			Greater g=new Greater();
			int r=g.compare(v1,v2);
			System.out.println("Greater value :"+r);
			break;
		case 2:
			Smaller s1=new Smaller();
			int r1=s1.compare(v1,v2);
			System.out.println("Greater value :"+s);
			break;
		}
		

	}

}
