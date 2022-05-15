package test;
import java.util.*;
public class Read 
{
	public void read(Scanner s, EmployeeDetails ed)
	{
		System.out.println("Enter the Empid");
		ed.eId=s.nextLine();
		System.out.println("Enter the EmpName");
		ed.eName=s.nextLine();
		System.out.println("Enter the Hno");
		ed.ea.hNo=s.nextLine();
		System.out.println("Enter the Sname");
		ed.ea.sName=s.nextLine();
		System.out.println("Enter the City");
		ed.ea.city=s.nextLine();
		System.out.println("Enter the Pincode");
		ed.ea.pinCode=s.nextInt();
	}

}
