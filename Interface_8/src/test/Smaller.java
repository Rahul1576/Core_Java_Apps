package test;

public class Smaller implements Icomparable
{
	public int compare(int x,int y)
	{
		if(x>y) return x;
		else return y;
	}

}
