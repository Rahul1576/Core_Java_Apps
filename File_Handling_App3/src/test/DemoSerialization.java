package test;
import java.util.*;
import java.io.*;
public class DemoSerialization 
{
	public static void main(String[] args) 
	{
		try {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the UserName");
			String uN=s.nextLine();
			System.out.println("Enter the Password");
			String pW=s.nextLine();
			System.out.println("Enter the FirstName");
			String fN=s.nextLine();
			System.out.println("Enter the LastName");
			String lN=s.nextLine();
			Register ob1=new Register(uN,pW,fN,lN,new Date());
			File f=new File("D:\\objDate.txt");
			FileOutputStream fos=new FileOutputStream(f);//new file created
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(ob1);//Serialization process
			System.out.println("Object stored Successfull");
			oos.close();
			s.close();
		}catch(Exception e) {e.printStackTrace();}
	}
}