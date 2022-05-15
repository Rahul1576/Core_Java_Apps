package test;
public class Display1 implements Runnable {
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("Thread-1 :"+i);
			try {
				Thread.sleep(2000);
			}catch(InterruptedException ie) {ie.printStackTrace();}
		}
	}
}
