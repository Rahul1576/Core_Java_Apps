package p2;
import java.util.Scanner;
import p1.Employeedata;
import p1.Employeeaddress;
import p1.Employeecontact;
public class Demomethod2 {

	public static void main(String[] args) 
	{
		
		
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter employee data");
		
		System.out.println("Enter id");
		String ei=sc.nextLine();
		System.out.println("Enter name ");
		String en=sc.nextLine();
		System.out.println("Enter designation");
		String ed=sc.nextLine();
		
		
		//System.out.println("Enter employee address");
		System.out.println("Enter house num.");
		String hn=sc.nextLine();
		System.out.println("Enter street no.");
		String sn=sc.nextLine();
		System.out.println("Enter city");
		String ec=sc.nextLine();
		System.out.println("Enter Pin");
		int ep=Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter mailid");
		String em=sc.nextLine();
		System.out.println("Enter phone");
		long ephone=sc.nextLong();
		
		Employeedata e1=new Employeedata(ei,en,ed);
		Employeeaddress e2=new Employeeaddress(hn,sn,ec,ep);
		Employeecontact e3=new Employeecontact(em,ephone); 
		
		e1.getemployeedata();
		e2.getemployeeaddress();
		e3.getemployeecontact();
		
		sc.close();
		
     

	}

}
