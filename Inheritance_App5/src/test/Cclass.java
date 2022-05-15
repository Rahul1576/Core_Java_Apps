package test;
public class Cclass  extends Pclass
{
	public Cclass(int a,int b,int c,int d)
	{
		this(a,b,c);
		System.out.println("d :"+d);
	}
	public Cclass(int a,int b,int c)
	{
		super(a,b);
		System.out.println("c :"+c);
	}

}
