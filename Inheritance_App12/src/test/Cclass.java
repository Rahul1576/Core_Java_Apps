package test;
public class Cclass extends Pclass
{
	public static void m(int y)
	{
		System.out.println("===Cclass m(y)===");
		System.out.println("y :"+y);
	}
	public static void m(int a,int b)
	{
		System.out.println("===Cclass m(a,b)===");
		System.out.println("a :"+a);
		System.out.println("b :"+b);
	}
	public void dis(int x,int y,int a,int b)
	{
		System.out.println("===method dis(y)===");
		super.m(x);
		this.m(y);
		this.m(a,b);
		
	}
}