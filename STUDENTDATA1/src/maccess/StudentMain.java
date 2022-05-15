package maccess;
import test.*;
import java.util.Scanner;
public class StudentMain 
{
	public static void main(String[] args) 
	{ 
		 Scanner s=new Scanner(System.in);
		 String s5=04;
         System.out.println("Enter roll number :");
         String roll=s.nextLine().toUpperCase();
         if (roll.length()==10)
         { 
        	 if()
        	 Validateroll vr=new Validateroll();
        	 boolean z=vr.verify(roll.substring(6,8));
        	 c=z.compareTo(s5);
        	 if(c)
        	 vr.details();
         }
         else
         {
        	 System.out.println("Invalid roll");
         }
	}

}
