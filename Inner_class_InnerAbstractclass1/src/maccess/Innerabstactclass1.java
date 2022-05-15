package maccess;
import test.*;
public class Innerabstactclass1 
{
	public static void main(String[] args) 
	{
	 System.out.println("==Abstract class inside the class===");
	 Subclass.Aclass1 ob1=new Subclass.Aclass1() 
	 {
		public void m1(int x) {
		System.out.println("X :"+x);	
		}
	};
	ob1.m1(234);
	Subclass ob=new Subclass();
	 Subclass.Aclass2 ob2=ob.new Aclass2() 
	 {
		public void m2(int y) {
		System.out.println("Y :"+y);	
		}
	};
	ob2.m2(234);
	 System.out.println("==Abstract class inside the Interface===");
	 Itest.Aclass ob3=new Itest.Aclass() 
	 {
		public void m(int x) {
			System.out.println("X :"+x);
		}
	};
	ob3.m(234);
	System.out.println("==Abstract class inside the Abstractclass===");
	Aclass.Aclass1 ob4=new Aclass.Aclass1() 
	{
		public void m1(int x) {
			System.out.println("X :"+x);
		}
	};
	ob4.m1(12);
	Aclass obb=new Aclass() {};
	Aclass.Aclass2 ob5=obb.new Aclass2()
			{
				public void m2(int y)
				{
					System.out.println("Y :"+y);	
				}
	      };
		ob5.m2(23);
	
	}	
}