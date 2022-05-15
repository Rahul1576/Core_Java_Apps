package test;

public class Subclass11
{
	public int a=10;
	public static int b=20;
	public void m1()
	{
		System.out.println("==outerclass m1()===");
		System.out.println("The value a :"+a);
		System.out.println("The value b :"+b);
	}//outer class method
	public class Subclass22
	{
		public static void m2()
		{
			System.out.println("==Innerclass static method m2()===");
			//System.out.println("The value a :"+a);
			System.out.println("The value b :"+b);
		}
		public void m22()
		{
			System.out.println("==Innerclass Instatnce method m22()===");
			System.out.println("The value a :"+a);
			System.out.println("The value b :"+b);
		}
		
	}//instatnce member Innerclass

}//outerclass
