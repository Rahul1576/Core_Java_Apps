package test;

public class Class_B extends Class_A
{
	public int b=20;
	public void m2()
	{
		System.out.println("==Childclass m2()==");
		System.out.println("The value b :"+b);
		
	}
	
	{
		System.out.println("==Childclass Instance Block==");
		System.out.println("The value b :"+b);
	}

}
