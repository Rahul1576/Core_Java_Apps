package p1;
import java.util.*;
import test.*;
public class Demo_ref2 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		Products p=new Products();//cons call
		Read r=new Read();
		r.read(s,p);
		Display d=new Display();//cons call
		d.dis(p);
		
		s.close();
	}
}
