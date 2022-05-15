package p1;

public class Employeedata 
{
	String empname,empid,empdesg;
	public Employeedata(String a,String b,String c)
	{
		empid=a;
		empname=b;
		empdesg=c;
	}
	public void getemployeedata()
	{
		System.out.println("=======employee data======");
		System.out.println("employee name = "+ empname);

		System.out.println("employee id = "+ empid);

		System.out.println("employee designation = "+ empdesg);

	}

}
