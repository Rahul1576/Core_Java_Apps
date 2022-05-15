package maccess;
import test.*;
public class Nonstatic_member 
{
	@SuppressWarnings("static-access")
	public static void main(String[] args)
	{
		Subclass11 ob1=new Subclass11();//outer class object
		ob1.m1();//outer class method call
		Subclass11.Subclass22 ob2=ob1.new Subclass22();
		//Instance member Inner class object
		Subclass11.Subclass22.m2();//inner class static method call
		ob2.m2();//Inner class Instance method call;
	}

}
