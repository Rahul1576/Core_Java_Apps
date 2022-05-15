package maccess;
import test.*;
public class Demothread7_staticSynchronization {
	public static void main(String[] args) {
		User1 ob1=new User1();
		User2 ob2=new User2();
		Thread t1=new Thread(ob1);
		Thread t2=new Thread(ob2);
		t1.setName("Smith");
		t2.setName("Rozer");
		
		t1.start();
		t2.start();
	}

}