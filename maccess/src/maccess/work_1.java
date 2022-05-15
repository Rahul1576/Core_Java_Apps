package maccess;
import java.util.*;
public class work_1 
{

	public static void main(String[] args) 
	{
		
     Scanner s = new Scanner(System.in);
     System.out.println("Enter the string");
     String str= s.nextLine();
     int len=str.length();
     int count=0;
     //int cconst=0;
     for(int i=0;i<len;i++)
     {
    	 char ch=str.charAt(i);
//    	 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
//    			 ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
//          {
//        	  
//	
//          }
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
				    	 }//end switch
				  
     }//end loop
     
    
     System.out.println("number of vowels = "+count);
	 s.close();
     
     
	}
	
	

}
