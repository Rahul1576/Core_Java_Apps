package maccess;
import tets.*;
import java.util.*;
@SuppressWarnings("serial")
public class Bank_Transactions extends Exception 
{
	public Bank_Transactions(String msg)
	{
		super(msg);
	}
	public static void main(String[] args) 
	{
		try(Scanner s=new Scanner(System.in);) //java7
		{
			try
			{
			System.out.println("Enter pinNo");
			int pinNo=s.nextInt();
			CheckPinNo cpn1=new CheckPinNo(); //cons_call
			cpn1.verify(pinNo);//method call
			System.out.println("====choice===");
			System.out.println("1.Withdraw\t2.Deposit");
			System.out.println("Enter choice");
			int choice=s.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the amount");
				int a1=s.nextInt();
				if(!(a1>0&&a1%100==0))//exception
				{
					Bank_Transactions ob2=new Bank_Transactions("Invalid amt");
					throw ob2;
				}//end if
				Withdraw wd=new Withdraw();
				wd.process(a1);
				break;
				
			case 2:
				System.out.println("Enter the amount");
				int a2=s.nextInt();
				if(!(a2>0&&a2%100==0))//exception
				{
					Bank_Transactions ob3=new Bank_Transactions("Invalid amt");
					throw ob3;
				}//end if
				Deposit dp=new Deposit();
				dp.process(a2);
				break;

			default:
				Bank_Transactions ob1=new Bank_Transactions("Invalid choice");
				throw ob1;
				
			}//end switch
		}//end try
			catch(CheckPinNo | Bank_Transactions | Withdraw ob)//java7
			{
				System.out.println(ob.getMessage());
			}
		}//end_try with resource
	}	
}