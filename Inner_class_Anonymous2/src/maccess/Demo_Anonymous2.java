package maccess;
import test.*;
public class Demo_Anonymous2 {

	public static void main(String[] args) {
		//Anonymous Inner class as implementation class;
		Itest ob=new Itest()
				{
			public void m1(int x)
			{
				System.out.println("=====Itest m1(x)===");
				System.out.println("X :"+x);
			}
			public void m2(int y)
			{
				System.out.println("=====Iclass m2(y)===");
				System.out.println("y:"+y);
			}
		};
				ob.m1(12);
				//ob.m2(34);

	}

}
