package maccess;
public class Thread_By_LambdaExpression {
	public static void main(String[] args) {
		//LambdaExprression as argument
		 Thread t1=new Thread(()->
         {
        		for(int i=1;i<=5;i++)
        		{
        			System.out.println("Thread-1 :"+i);
        			try {
        				Thread.sleep(2000);
        			}catch(InterruptedException ie) {ie.printStackTrace();}
        		}
         });
         Thread t2=new Thread(()->
         {
        		for(int i=101;i<=105;i++)
        		{
        			System.out.println("Thread-2 :"+i);
        			try {
        				Thread.sleep(2000);
        			}catch(InterruptedException ie) {ie.printStackTrace();}
        		}
         });
         t1.start();
         t2.start();
	}

}
