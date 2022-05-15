package maccess;
import test.Addition;
import java.util.*;
public class DemoInterface2 
{
	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the value of x");
	int x=s.nextInt();
	System.out.println("Enter the value of y");
	int y=s.nextInt();
	Addition ob=new Addition();
	ob.process(x, y);
	s.close();
	}

}
