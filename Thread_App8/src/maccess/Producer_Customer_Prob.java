package maccess;
import test.*;
public class Producer_Customer_Prob {
	public static void main(String[] args) {
		Producer p=new Producer();
		Consumer c=new Consumer(p);
		Thread t1=new Thread(p);
		Thread t2=new Thread(c);
		t1.start();
		t2.start();

	}

}
