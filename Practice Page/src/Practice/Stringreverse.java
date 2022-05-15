package Practice;
import java.util.*;
public class Stringreverse {

	public static void main(String[] args)
	{
		System.out.println("Enter String");
	Scanner s=new Scanner(System.in);
	String str=s.nextLine();
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		System.out.print(ch+"=");//print
		int str2=(int)ch;
		System.out.print(str2+" ");
	}

	}

}
