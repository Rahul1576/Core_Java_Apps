package test;
public abstract class Abstract_method 
{
	public int a;
	public float b;
	public abstract void input();
	//void display();
	
	public void display()
	{
		System.out.println("a :"+a +"\t" +"b :"+b);
		System.out.println("sum :"+(a+b));
	}
}
