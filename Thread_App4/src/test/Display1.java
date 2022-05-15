package test;
public class Display1 {
         public static void dis1()
         {
        	 for(int i=1;i<=5;i++)
     		{
     			System.out.println("Thread-1 :"+i);
     			try {
     				Thread.sleep(2000);
     			}catch(InterruptedException ie) {ie.printStackTrace();}
     		}
         }
}
