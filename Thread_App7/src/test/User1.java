package test;
public class User1 implements Runnable
{
	public void run()
	{
		Printer.print(5,Thread.currentThread().getName());
	}
}
