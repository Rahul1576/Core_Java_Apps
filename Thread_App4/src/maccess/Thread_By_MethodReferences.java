package maccess;
import test.*;
public class Thread_By_MethodReferences {
	public static void main(String[] args) {
		
		Thread t1=new Thread(Display1::dis1);
        Thread t2=new Thread(Display2::dis2);
        
        t1.start();
        t2.start();
	}
}
