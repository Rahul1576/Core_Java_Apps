package maccess;
import java.util.*;
import test.*;
public class DemoRef1 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		EmployeeAddress ea=new EmployeeAddress();//cons call
		EmployeeDetails ed=new EmployeeDetails(ea);//const call
        Read r=new Read();
	    r.read(s,ed);//method call
	    Display d=new Display();
	    d.dis(ed);//method call
	    s.close();
	
	}

}
