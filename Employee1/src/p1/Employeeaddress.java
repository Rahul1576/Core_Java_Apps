package p1;

public class Employeeaddress 
{
	String hno,sname,city;
	public int pincode;
	public Employeeaddress(String a,String b,String c,int d)
	{
		hno=a;
		sname=b;
		city=c;
		pincode=d;
	}
	public void getemployeeaddress()
	{
		System.out.println("=======employee address======");
		System.out.println("house no = "+hno);

		System.out.println("street name= "+sname);

		System.out.println("city= "+city);
		System.out.println("pin code="+pincode);

	}

}
