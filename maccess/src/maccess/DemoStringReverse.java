package maccess;
import java.util.Scanner;
import java.util.StringTokenizer;
public class DemoStringReverse {

	public static void main(String[] args) 
	{

    Scanner s=new Scanner(System.in);
    System.out.println("Enter the string");
    String str=s.nextLine();
    StringTokenizer st=new StringTokenizer(str," ");
    System.out.println("=====display result====");
     while(st.hasMoreTokens())
     {
    	 String s1=st.nextToken();
    	 StringBuffer sb=new StringBuffer(s1);
    	 System.out.print(sb.reverse() + " ");
     }
     s.close();
	}

}
