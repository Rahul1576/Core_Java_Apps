package maccess;
import test.*;
import java.util.*;
public class Demo_LambdaExpression3 
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
	        Icomparable gt=(int x,int y)->
	        {
	        	if(x>y) return x;
	        	else return y;
	        };
			int r1=gt.compareTo(v1,v2);
			System.out.println("Greater value :"+r1);
			break;
		
		case 2:
			Icomparable sm=(int x,int y)->
	        {
	        	if(x<y) return x;
	        	else return y;
	        	
	        };
			int r2=sm.compareTo(v1,v2);
			System.out.println("Smaller value :"+r2);
			break;
			default:
				System.out.println("Invalid choice");
		}
		s.close();
	}
}
