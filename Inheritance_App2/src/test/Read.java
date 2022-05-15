package test;
import java.util.*;
public class Read extends Products
{
	public void read()
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the pCode :");
	pCode=s.nextLine();
	System.out.println("Enter the pName :");
	pName=s.nextLine();
	System.out.println("Enter the pPrice :");
	pPrice=s.nextFloat();
	System.out.println("Enter the pQty :");
	pQty=s.nextInt();
	s.close();
	}
}