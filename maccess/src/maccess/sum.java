package maccess;
import java.util.*;
public class sum {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String str=s.nextLine();
		int len=str.length();
		int sum=0;
		for(int i=0;i<len;i++)
		{
			char ch=str.charAt(i);
			int k=(int)ch;
			if(k>=48 && k<=57)
			{
				
				char ch2=(char)k;
				String s2=String.valueOf(ch2);//char to switch
				int z=Integer.parseInt(s2); //String to integer
				
				sum=sum+z;
			}//end if
		}//endloop
		System.out.println("sum of string ="+sum);
		s.close();
		
		
	

	}

}
