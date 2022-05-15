package maccess;
import java.util.*;
@SuppressWarnings("serial")
public class Exception_Handling1 extends Exception {
	public Exception_Handling1(String msg)//Parametrized constructor
	{
		super(msg);
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		try {
			System.out.println("Enter the bsal");
			int bsal=s.nextInt();//exception for non-interface value.
			if(bsal<12000)//exception
			{
			Exception_Handling1 ob=new Exception_Handling1("Invalid bsal");
			throw ob;
			}
			float totsal=bsal+(0.96F*bsal)+(0.63F*bsal);
			System.out.println("Bsal :"+bsal);
			System.out.println("Totsal :"+totsal);
		}//end of try
		catch(InputMismatchException ime)
		{
			System.out.println("Enter only interger value");
		}
		catch(Exception_Handling1 ob)
		{
			System.out.println(ob.getMessage());
		}
		finally
		{
			s.close();
		}
	}
}