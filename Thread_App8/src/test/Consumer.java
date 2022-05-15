package test;
public class Consumer implements Runnable
{
	public Producer p;
	public Consumer(Producer p)
	{
		this.p=p;
	}
	public void run()
	{
		synchronized(p.sb)
		{
			try {
				System.out.println("Consumer Blocked and waiting for msg");
				p.sb.wait();
				System.out.println("Display using Consumer");
				System.out.println(p.sb.toString());
			}catch(Exception e) {e.printStackTrace();}
		}
	}
}