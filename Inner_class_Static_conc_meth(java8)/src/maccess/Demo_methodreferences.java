package maccess;
import test.*;
public class Demo_methodreferences {

	public static void main(String[] args) {
		Itest ob1=Display::new;
		ob1.dis(200);
		
		Display d=new Display(123);
		Itest ob2=d::m2;
		ob2.dis(300);
		
		
		Itest ob3=Display::m1;
		ob3.dis(400);
	}
}