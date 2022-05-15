package test;
public class Subclass1 
{
	public int  a=10;      //memory in object
	public static int b=20;//memory in class
	public void m1()       //memory in object
	{
		System.out.println("=======outer class method m1()=====");
		System.out.println("The value a :"+a);
		System.out.println("The value b :"+b);
	}//outer class method
	public static class Subclass2
	{
		public static void m2()//memory in class
		{
			System.out.println("Innerclass Static method m2()");
			//System.out.println("The value a :"+a);
			System.out.println("The value b :"+b);
		}
		public void m22()//memory in object
		{
		System.out.println("Inner class Instance method m22()==");
		//System.out.println("The value a :"+a);
		System.out.println("The value b :"+b);
		}
	}//static member inner class
}//outer class
