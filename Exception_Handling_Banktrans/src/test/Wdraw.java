package test;
@SuppressWarnings("serial")
public class Wdraw extends Exception 
{
	public Wdraw(String msg)
	{
		super(msg);
	}
	public void wdraw(int a,int b)
	{
		try 
		{	
		if(a>=b)
		{
		    Wdraw wd=new Wdraw("Insufficient balance");
		    throw wd;
		}
		System.out.println("Amount To Withdraw : "+a);
	    System.out.println("Balance Amount: "+(b-a));
	    System.out.println("Transaction Completed");
		}
		catch(Wdraw wd)
		{
			System.out.println(wd.getMessage());
			//throw wd;
		}	
	}
}