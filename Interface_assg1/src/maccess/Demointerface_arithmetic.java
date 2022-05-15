package maccess;
import java.util.*;
import test.*;
public class Demointerface_arithmetic
{
	public static void main(String[] args) 
	{
	  	Scanner s=new Scanner(System.in);
	  	System.out.println("Enter First no :");
	  	int v1=s.nextInt();
		System.out.println("Enter Second no :");
	  	int v2=s.nextInt();
		System.out.println("======Choice======");
		System.out.println("1.Add\n2.Sub\n3.Mult\n4.Div\n5.Modiv:");
		int choice=s.nextInt();
		switch(choice)
		{
		case 1:
			Addition ad=new Addition();
			double sr1=ad.process(v1,v2);
			System.out.println(" Addition is :"+sr1);
			break;
		case 2:
			Subtraction sb=new Subtraction();
			double sr2=sb.process(v1,v2);
			System.out.println(" Subtraction is :"+sr2);
			break;
		case 3:
			Multiplication ml=new Multiplication();
			double sr3=ml.process(v1,v2);
			System.out.println(" Multiplication is :"+sr3);
			break;
		case 4:
			Division dv=new Division();
			double sr4=dv.process(v1,v2);
			System.out.println(" Division is :"+sr4);
			break;
		case 5:
			Moddiv md=new Moddiv();
			double sr5=md.process(v1,v2);
			System.out.println(" ModDivision is :"+sr5);
			break;
			
		default:
			System.out.println("Invalid Choice");
		} 
		s.close();
	}
}