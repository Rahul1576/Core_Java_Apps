package test;
public class Ctest 
{
	private static Ctest ob=null;
	private Ctest() {}
		static 
		{
			ob=new Ctest();//con_call
			
		}
		public static Ctest getRef()
		{
			return ob;
		}
		public void dis(int z)
		{
			System.out.println("==dis()====");
			System.out.println("The value z:"+z);
		}	
}