package maccess;
import test.*;
public class DemoThread_SynchronizedMethod {
	public static void main(String[] args) {
		Printer p=new Printer();
		User1 ob1=new User1(p); //user1 object holding reference of Printer 
		User2 ob2=new User2(p); //user1 object holding reference of Printer 
       Thread t1=new Thread(ob1);
       Thread t2=new Thread(ob2);
       t1.setName("Alex");
       t2.setName("Raju");
       t1.start();//Alex started the print process
       t2.start();
	}

}
