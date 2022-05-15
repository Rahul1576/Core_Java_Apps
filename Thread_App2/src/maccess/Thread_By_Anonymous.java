package maccess;
public class Thread_By_Anonymous   {
	public static void main(String[] args) {
		//Anonymous InnerClass an argument
         Thread t1=new Thread(new Runnable()
         {
        	public void run()
        	{
        		for(int i=1;i<=5;i++)
        		{
        			System.out.println("Thread-1 :"+i);
        			try {
        				Thread.sleep(2000);
        			}catch(InterruptedException ie) {ie.printStackTrace();}
        		}
        	}
         });
         Thread t2=new Thread(new Runnable()
         {
        	public void run()
        	{
        		for(int i=101;i<=105;i++)
        		{
        			System.out.println("Thread-2 :"+i);
        			try {
        				Thread.sleep(2000);
        			}catch(InterruptedException ie) {ie.printStackTrace();}
        		}
        	}
         });
         
         t1.start();
         t2.start();
	}
}