package test;
public class Pclass 
{
	public static int a=10;
	public static void m1()
	{
		
		System.out.println("========Pclass m1()========");
		System.out.println("The value a :"+a);
	}
	static
	{
		System.out.println("=====Pclass Static Block=====");
		System.out.println("The value a :"+a);
	}

}
