package test;
public interface Itest 
{
	public abstract void m1(int x);
	private void m2(int y)
	{
		System.out.println("=======private method m2()=====");
		System.out.println("The value y :"+y);
	}
	private static void m3(int z)
	{
		System.out.println("=======private method m3()=====");
		System.out.println("The value x :"+z);
	}
	public default void dis(int y,int z)
	{
		this.m2(y);
		Itest.m3(z);	
	}
}