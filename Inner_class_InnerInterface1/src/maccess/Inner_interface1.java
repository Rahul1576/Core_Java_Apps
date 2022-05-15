package maccess;
import test.*;
class Inner_interface1 {

	public static void main(String[] args) {
		System.out.println("===Inner_Interface within class===");
		Subclass.Itest1 ob1=(int x)->
		{
			System.out.println("x :"+x);
		};
		ob1.m1(123);
		//lambdaexpression
		Subclass.Itest2 ob2=(int y)->
		{
			System.out.println("y :"+y);
		};
		ob2.m2(124);
		System.out.println("===Inner_Interface within Interface===");
		Itest1.Itest2 ob3=(int x)->
		{
			System.out.println("x :"+x);	
		};
		ob3.m2(234);
		System.out.println("===Inner_Interface within Abstract class===");
        Aclass.Itest1 ob4=(int x)->
        {
        	System.out.println("x :"+x);	
        };
        ob4.m1(345);
        
        Aclass.Itest2 ob5=(int y)->
        {
        	System.out.println("y :"+y);	
        };
        ob5.m2(456);

	}

}
