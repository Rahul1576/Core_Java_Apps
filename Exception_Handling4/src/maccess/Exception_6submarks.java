package maccess;
import java.util.*;
@SuppressWarnings("serial")
public class Exception_6submarks  extends Exception
{
	public Exception_6submarks(String msg)
	{
		super(msg);
	}
	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
	int i=1,totmarks=0;
	System.out.println("===Read 6 Sub Marks");
	while(i<=6)
	{
		try 
		{
			System.out.println("enter marks of sub"+i);
			int sub=Integer.parseInt(s.nextLine());//exception
			if(sub<0||sub>100)
			{
				Exception_6submarks ob=new Exception_6submarks("Invalid marks");
				throw ob;
			}
			if(sub>=0&&sub<=34) //exception
			{
				Exception_6submarks ob=new Exception_6submarks("Failed in sub");
				throw ob;
				
			}
			totmarks=totmarks+sub;
			i++;

		}//end of try
		catch(NumberFormatException ife)
		{
			System.out.println("Enter only integer value");	
		}
		catch(Exception_6submarks ob)
		{
			System.out.println(ob.getMessage());
			if(ob.getMessage().equalsIgnoreCase("Failed in subject"));
			{
				System.out.println("Program stopped");
				System.exit(0);
			}
		}
	}//end of loop
	System.out.println("Totmarks: "+totmarks);
	float per=(float)totmarks/6;
	System.out.println("Per :"+per);
	s.close();

	}

}
