package maccess;
import java.util.*;
public class StringBuffer6 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string :");
		String str1=s.nextLine();
		StringBuffer sb=new StringBuffer(str1);
		sb.reverse();
		System.out.println("=====Original Strings====");
		System.out.println("Str1 :"+str1.toString());
		System.out.println("sb :"+sb.toString());
		
		System.out.println("=====Palindrome process====");
		String str2=new String(sb);
		System.out.println("str2 :"+str2.toString());
		if(str1.equals(str2))
		{
			System.out.println("Palindrome String");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		s.close();

	}

}
