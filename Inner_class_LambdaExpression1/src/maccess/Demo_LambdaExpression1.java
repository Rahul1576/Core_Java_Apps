package maccess;
import test.*;
public class Demo_LambdaExpression1 {

	public static void main(String[] args) {
	
		//Anonymous Inner class as implementation class
		Itest ob=(int x)->
		{
			   System.out.println("=====Iclass m1(x)===");
				System.out.println("X :"+x);
		};
		ob.m1(12);

	}

}
