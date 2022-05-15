package test1;

public class Withdraw 
{
	public Withdraw(int amt,double balance)
	{
		if(amt<balance)
		{
            System.out.println("amount withdraw="+amt);

            System.out.println("balance="+(balance-amt));

            System.out.println("transaction complete");

		}
		else
		{
            System.out.println("Invalid fund");

		}
	}

}
