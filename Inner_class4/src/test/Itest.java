package test;
public interface Itest 
{
	public static class Subclass2
	{
		public static void m2(int x)
		{
			System.out.println("==m2()==");
			System.out.println("X :"+x);
			
		}
		public void m21(int y)
		{
			System.out.println("==m21()==");
			System.out.println("y :"+y);
			
		}
	}

}
