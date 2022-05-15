package test;
public class Cclass extends Pclass
{
	public static int b=20;
	public static void m2()
	{
		System.out.println("==========Class m2()===========");
		System.out.println("The value of b :"+b);
	}
	static
	{
		System.out.println("=====Class static Block=====");
		System.out.println("The value b :"+b);
	}

}
