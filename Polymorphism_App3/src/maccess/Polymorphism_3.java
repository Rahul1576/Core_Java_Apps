package maccess;
import java.util.*;
import test.*;
public class Polymorphism_3 {

	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    try(s;)
	    {
	    	try {
	    		System.out.println("Enter home Accno");
	    		long hAccno=s.nextLong();
	    		System.out.println("Enter benificiary Accno");
	    		long bAccno=s.nextLong();
	    		System.out.println("Enter Amount to transfer");
	    		float amt=s.nextFloat();
	    		
	    		Translog ob=new Translog(hAccno,bAccno,amt,new Date());//Immutable object
	    		System.out.println("==Transaction Details");
	    		System.out.println("hAccno :"+ob.gethAccno());
	    		System.out.println("bAccno :"+ob.getbAccno());
	    		System.out.println("amt :"+ob.getamt());
	    		System.out.println("Date ana Time:"+ob.getD());
	    	}
	    	catch(Exception e) {e.printStackTrace();}
	    }

	}

}
