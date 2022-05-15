package maccess;
import test.*;
import java.util.*;
public class Arithmetic_lambda {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=s.nextInt();
		System.out.println("Enter second number");
		int b=s.nextInt();
		System.out.println("========choice=========");
		System.out.println("1.add\\n2.sub\\n3.mult\\n4.div\\n5.modiv");
		System.out.println("Enter choice");
		int choice=s.nextInt();
		switch(choice)
		{
		case 1:
			Iarithmetic ad=(int x,int y)->a+b;
			System.out.println("Sum :"+ad.process(a,b));
		    break;
	
		case 2:
		Iarithmetic sb=(int x,int y)->a-b;
		System.out.println("Sub :"+sb.process(a,b));
		break;
		
		case 3:
			Iarithmetic mu=(int x,int y)->a*b;
			System.out.println("Mul :"+mu.process(a,b));
		    break;
		    
		case 4:
			Iarithmetic di=(int x,int y)->a/b;
			System.out.println("Div :"+di.process(a,b));
		    break;
		    
		case 5:
			Iarithmetic md=(int x,int y)->a%b;
			System.out.println("Mod div :"+md.process(a,b));
		    break;
		    
		    default:
		    	System.out.println("invalid choice");	
	}
		s.close();

	}

}
