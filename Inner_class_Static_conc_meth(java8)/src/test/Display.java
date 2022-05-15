package test;

public class Display 
{
	public Display(int x)
	{
		System.out.println("Body of constructor");
		System.out.println("The value x:"+x);
	}
	public static void m1(int y)
	{
		System.out.println("Body of static method");
		System.out.println("The value y:"+y);
	}
	public void m2(int z)
	{
		System.out.println("Body of Instance method");
		System.out.println("The value z:"+z);
	}
}
