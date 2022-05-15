package test;
import java.util.*;
public class Read 
{
	public void read(Scanner s, Products p)
	{
//Scanner s =new Scanner(System.in);
	System.out.println("Enter Product code");
	p.pcode=s.nextLine();
	//Interger i=int.parseInt(s.nextLine);
	System.out.println("Enter Product name");
	p.pname=s.nextLine();
	System.out.println("Enter Product price");
	p.price=s.nextFloat();
	System.out.println("Enter Product Qty");
	p.qty=s.nextInt();
	}
	

}
