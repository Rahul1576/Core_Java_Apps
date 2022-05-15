package maccess;
import java.util.*;
import tets.*;
public class Demo_annonymous_arithmetic 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=s.nextInt();
		System.out.println("Enter Second number");
		int b=s.nextInt();
//		Itest5 ob1=new Itest5()
//				{
//			public void m1(int a, int b)
//			{
//				System.out.println("add :"+(a+b));
//			}
//				};
//				ob1.m1(a,b);
		System.out.println("========choice==========");
		System.out.println("1.Add\t2.Sub\t3.Mult\t4.Div\t5.Mod");
		System.out.println("Enter choice");
		int c=s.nextInt();
		switch(c)
		{
		case 1:
				Itest5 ob=new Itest5()
				{
					public void m1(int a,int b)
					{
						System.out.println("Add :"+(a+b));	
					}
				};
				ob.m1(a,b);
				break;
		case 2:
				Itest5 ob1=new Itest5()
				{
					public void m1(int a,int b)
					{
						System.out.println("Sub :"+(a-b));	
					}
				};
				ob1.m1(a,b);
				break;
		case 3:
				Itest5 ob3=new Itest5()
				{
					public void m1(int a,int b)
					{
						System.out.println("Mult :"+a*b);	
					}
				};
				ob3.m1(a,b);
				break;
		case 4:
				Itest5 ob4=new Itest5()
				{
					public void m1(int a,int b)
					{
						System.out.println("Div :"+a/b);	
					}
				};
				ob4.m1(a,b);
				break;
		case 5:
				Itest5 ob5=new Itest5()
				{
					public void m1(int a,int b)
					{
						System.out.println("Mod :"+a%b);	
					}
				};
				ob5.m1(a,b);
				break;
		default:
			System.out.println("Invalid choice");
			break;
		}
		s.close();
	}
}