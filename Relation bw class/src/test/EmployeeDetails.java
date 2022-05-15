package test;
public class EmployeeDetails 
{
	public String eId,eName,eDesg;
	public EmployeeAddress ea;
	public EmployeeDetails(EmployeeAddress a)
	{
		ea=a;
	}
	public void getEmployeeDetails()
	{
		System.out.println("Employee Details");
		System.out.println("Eid :"+eId);
		System.out.println("Ename :"+eName);
		System.out.println("Edesg :"+eDesg);
	}
}

