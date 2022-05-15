package maccess;
import test.*;
public class DemoInnerclass4 
{
	public static void main(String[] args) {
		System.out.println("*******Innerclass within interface***");
		Itest.Subclass2 ob1=new Itest.Subclass2();
		Itest.Subclass2.m2(12);
		ob1.m21(13);
		
		System.out.println("******* Static Innerclass within Abstractclass***");
		Aclass.Subclass3 ob2=new Aclass.Subclass3();
		Aclass.Subclass3.m3(12);
		ob2.m31(13);
		System.out.println("*******Nonstatic Innerclass within Abstractclass***");
		Eclass ob=new Eclass();
		Aclass.Subclass33 ob3=ob.new Subclass33();
		Aclass.Subclass33.m32(23);
		ob3.m34(34);
	}

}
