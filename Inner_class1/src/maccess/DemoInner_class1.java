package maccess;
import test.*;
public class DemoInner_class1 {

	public static void main(String[] args) {
		Subclass1 ob1=new Subclass1();//outer_class object
		ob1.m1();//outerclass method call
		Subclass1.Subclass2 ob2=new Subclass1.Subclass2();
		//static member Innerclass object
		Subclass1.Subclass2.m2();//Innerclass static method call
		ob2.m22();//inner class Instatnce method call

	}

}
