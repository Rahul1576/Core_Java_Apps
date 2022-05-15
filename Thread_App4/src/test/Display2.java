package test;
public class Display2 {
	 public static void dis2()
     {
    	 for(int i=101;i<=105;i++)
 		{
 			System.out.println("Thread-2 :"+i);
 			try {
 				Thread.sleep(2000);
 			}catch(InterruptedException ie) {ie.printStackTrace();}
 		}
     }
}
