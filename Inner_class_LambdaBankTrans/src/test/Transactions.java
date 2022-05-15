package test;
public interface Transactions 
{
	public static final Balance b=new Balance();
	public abstract void process(int amt);
}
