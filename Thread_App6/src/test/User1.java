package test;
public class User1 implements Runnable
{
	public Printer p;
	public User1(Printer p)
	{
		this.p=p;
	}
	public void run()
	{
		p.print(5,Thread.currentThread().getName());
	}
}
