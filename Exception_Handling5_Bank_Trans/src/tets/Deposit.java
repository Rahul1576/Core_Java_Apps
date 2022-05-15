package tets;
public class Deposit implements Transactions
{
	public void process(int amt)
	{
		System.out.println("Amt deposited:"+amt);
		b.bal=b.bal+amt;
		b.getBalance();
		System.out.println("Transaction completed");
	}
}
