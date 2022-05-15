package maccess;
import java.util.*;
import test.*;
public class Demo_ref3 {

	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
	
	Products p=new Products();
	Read r=new Read(p);
	r.read(s);
	Display d=new Display(p);
	d.dis();
	s.close();

	}

}
