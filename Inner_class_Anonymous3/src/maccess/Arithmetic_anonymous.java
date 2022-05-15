package maccess;
import test.*;
import java.util.*;
public class Arithmetic_anonymous 
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first number :");
		int v1=s.nextInt();
		System.out.println("Enter second number :");
		int v2=s.nextInt();
		System.out.println("=====choice=====");
		System.out.println("1.add\n2.sub\n3.mult\n4.div\n5.modiv");
		System.out.println("Enter choice");
		int choice=s.nextInt();
		
		switch(choice)
		{
		case 1:
			Iarithmetic  ad=new Iarithmetic()
			{
				public double process(int x,int y)
				{
					return x+y;
				}

				@Override
				public double procees(int x, int y) {
					// TODO Auto-generated method stub
					return 0;
				}
			};
		System.out.println("Sum :"+ad.procees(v1,v2));
		break;
		
		case 2:
			Iarithmetic sb=new Iarithmetic()
			{
				public double process(int x,int y)
				{
					return x-y;
				}

				@Override
				public double procees(int x, int y) {
					// TODO Auto-generated method stub
					return 0;
				}
			};
			System.out.println("Sub :"+sb.procees(v1,v2));
			break;
		}
		s.close();
	}
}