package maccess;
import java.util.*;

public class DemoTokenizer {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=s.nextLine();
		
		StringTokenizer st=new StringTokenizer(str,"a");
		System.out.println("count of tokens :"+st.countTokens());
		System.out.println("Display tokens");
		
		while(st.hasMoreTokens())
		{
			String tk=st.nextToken();        //retrieving the data
			System.out.println(tk.toString());
			System.out.println("count of tokens :"+st.countTokens());
			
		}//end loop
		s.close();
	}

}
