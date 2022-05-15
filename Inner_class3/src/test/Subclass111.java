package test;
public class Subclass111 
{
	public int a=10;
	public static int b=20;
	
	public void m1()
	{
		class Subclass2
		{
			public void m2()
			{
				System.out.println("===Instatnce method m2()===");
				System.out.println("The value a :"+a);
				System.out.println("The value b :"+b);
			}
			public static void m21()
			{
			System.out.println("===Instatnce method m2()===");
			//System.out.println("The value a :"+a);
			System.out.println("The value b :"+b);
			}
		}
		Subclass2 ob2=new Subclass2();
		ob2.m2();
		Subclass2.m21();
	}
	public static void m11()
	{
		class Subclass22
		{
			public void m3()
			{
				System.out.println("===Instatnce method m3()===");
				//System.out.println("The value a :"+a);
				System.out.println("The value b :"+b);
			}
			public static void m31()
			{
			System.out.println("===Instatnce method m33()===");
			//System.out.println("The value a :"+a);
			System.out.println("The value b :"+b);
		    }
		}
		Subclass22 ob22=new Subclass22();
		ob22.m3();
		Subclass22.m31();
	}

}
