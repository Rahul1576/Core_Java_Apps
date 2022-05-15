package maccess;
import java.util.*;
public class vowel
{
	public static void main()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=s.nextLine();
		int len=str.length();
		int count=0;
		for(int i=0;i<len;i++)
		{
			char ch=str.charAt(i);
			switch(ch)
			{
			case 'a':
			case 'A':count++;
			break;
			case 'e':
			case 'E':count++;
			break;
			case 'i':
			case 'I':count++;
			break;
			case 'o':
			case 'O':count++;
			break;
			case 'u':
			case 'U':count++;
			break;
			}//end of switch
		}//end of loop
		System.out.println("Count of vowels :"+count);
		s.close();
		

	}

}
