package test;

public abstract class Aclass 
{
	public int a;
	public double result;
	public Aclass(int a)
	{
		this.a=a;
	}
	public void calculate()
	{
		result=Math.pow(a,3);
	}
	public abstract void getResult();

}
