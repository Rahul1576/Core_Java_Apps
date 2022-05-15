package test;
public class Polymorphism_add
{
			public void add(int x,int y)
			{
				System.out.println("Sum1 :"+(x+y));
			}
			public void add(int x,float y)
			{
				System.out.println("Sum2:"+(x+y));
			}
			public void add(int x,int y,int z)
			{
				System.out.println("Sum3:"+(x+y+z));
			}
	public static void main(String[] args)
	{
		Polymorphism_add ad=new Polymorphism_add();
		ad.add(10,20);
		ad.add(40,2.5f);
		ad.add(80,35,56);
	}
}