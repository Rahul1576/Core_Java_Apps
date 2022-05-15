package test;
import java.util.*;
public class Read 
{
	public Products p=null;// Reference_variable
	public Read(Products prod) 
	{
	p=prod;
	}
	public void read(Scanner s)
	{
		System.out.println("Enter the Pcode");
		p.pCode=s.nextLine();
		System.out.println("Enter the Pname");
		p.pName=s.nextLine();
		System.out.println("Enter the Pprice");
		p.pPrice=s.nextFloat();
		System.out.println("Enter the Pqty");
		p.pQty=s.nextInt();
	}
}