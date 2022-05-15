package p1;

public class Employeecontact {
	String mailid;
	public long phone;
	public Employeecontact(String a,long b)
	{
		mailid=a;
		phone=b;
	}
	public void getemployeecontact()
	{
		System.out.println("=======employee contact======");
		System.out.println("mail id= "+mailid);
		System.out.println("phone number = "+phone);

	}

}
