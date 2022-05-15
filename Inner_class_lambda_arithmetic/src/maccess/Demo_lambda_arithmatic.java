package maccess;
import java.util.*;
import test.*;
public class Demo_lambda_arithmatic 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter Second number");
		int b=sc.nextInt();
		System.out.println("----------choice-----------");
		System.out.println("1.Add\t2.Sub\t3.Mult\t4.Div\t5.Mod");
		System.out.println("Enter choice");
		int c=sc.nextInt();
		switch(c)
		{
		case 1:
			Itest1 ob=(int x,int y)->x+y;
				System.out.println("Add :"+ob.m1(a,b));	
			    break;
			
		case 2:
			Itest1 ob1=(int x,int y)->x-y;
                 System.out.println("Sub :"+ob1.m1(a,b));	
			    break;
		case 3:
			Itest1 ob3=(int x,int y)->a*b;
				System.out.println("Mult :"+ob3.m1(a,b));	
			   break;
		case 4:
			Itest1 ob4=(int x,int y)->a/b;
				System.out.println("Div:"+ob4.m1(a,b));	
			    break;
		case 5:
			Itest1 ob5=(int x,int y)->x%y;
			System.out.println("Mod :"+ob5.m1(a,b));
				break;
		default:
			System.out.println("Invalid choice");
		
		}
      sc.close();
	}
}