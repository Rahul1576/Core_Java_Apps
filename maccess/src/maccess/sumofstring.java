package maccess;

import java.util.Scanner;

public class sumofstring {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
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
				
				
				
			}//end of if
		}//end of loop
	
  System.out.println("Sum of number:"+sum);
  s.close();
	}

}
