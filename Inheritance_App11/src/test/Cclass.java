package test;
public class Cclass extends Pclass
{
	public int a=20;
	public void m1()
	{
		super.m1();
		System.out.println("=====Cclass m1()======");
		System.out.println("The value a :" +a);
	}
	public void dis()
	{
		System.out.println("====method dis()=====");
		System.out.println("variable of Pclass :"+super.a);
		System.out.println("variable of Cclass :"+this.a);
		super.m1();
		this.m1();
	}
}
