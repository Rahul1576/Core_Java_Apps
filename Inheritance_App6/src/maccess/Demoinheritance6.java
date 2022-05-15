package maccess;
import test.*;
public class Demoinheritance6 
{
	public static void main(String[] args) 
	{
		System.out.println("========Access using cclass========");
		Cclass ob =new Cclass();
		ob.m1();//Pclass method call
		ob.m2();//Cclass method call
		Cclass.m1(); //Pclass method call
		Cclass.m2(); //Cclass method call
		  System.out.println("===========Access using object=========");
		
	

	}

}
