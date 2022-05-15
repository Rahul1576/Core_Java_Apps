package maccess;
import test.*;
import java.util.*;
public class Demo_abstract_class 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value");
		int a=s.nextInt();
		Eclass ob=new Eclass(a);
		ob.calculate();
		ob.getResult();
s.close();
	}

}
