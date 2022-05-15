package test;
public class User2 implements Runnable
{
	public Printer p;
	public User2(Printer p)
	{
		this.p=p;
	}
	public void run()
	{
		synchronized(p)//locking printer object
		{
			p.print(5,Thread.currentThread().getName());
		}
	}
}