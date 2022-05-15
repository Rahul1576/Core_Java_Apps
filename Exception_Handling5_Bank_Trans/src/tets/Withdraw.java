package tets;
@SuppressWarnings("serial")
public class Withdraw extends Exception implements Transactions
{
	public Withdraw() {}
    public Withdraw(String msg)
    {
    	super(msg);
    }
    public void process(int amt) throws Withdraw
    {
    	try {
    		if(amt>b.bal)//exception
    		{
    			Withdraw wd=new Withdraw("Insufficient balance");
    			throw wd;
    		}//end if
    		System.out.println("Amt Withdraw:"+amt);
    		b.bal=b.bal-amt;
    		b.getBalance();
    		System.out.println("Transaction completed");
    	}///end try
    	catch(Withdraw wd)
    	{
    		throw wd;
    	}
    }
    
}
