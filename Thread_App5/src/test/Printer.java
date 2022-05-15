package test;
public class Printer{
	public void print(int n,String user)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i+" "+"printfor"+" "+user);
			try {
				Thread.sleep(2000);
			}catch(Exception e) {e.printStackTrace();}
		}
	}
}
