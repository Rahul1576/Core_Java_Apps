package test;
public class Pclass 
{
	public void m(int a)
	{
		System.out.println("a :"+a);
	}
	public void m(int a,int b)
	{
		this.m(a);
		System.out.println("b :"+b);
		
	}

}
