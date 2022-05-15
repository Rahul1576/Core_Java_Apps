package maccess;
import java.util.*;
public class Find_length_ofname 
{
	public static void main(String[] args) 
	{
		int count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter name");
		String b=s.nextLine();
		for(int i=0;i<b.length();i++)
		{
			count++;
		}
		System.out.println("Length of name :"+count);
		s.close();
	}
	
}