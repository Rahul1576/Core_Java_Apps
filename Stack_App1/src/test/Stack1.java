package test;
import java.util.*;
public class Stack1 {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     try(s;)
     {
    	 try {
    		 Stack<Integer> st=new Stack<Integer>();
    		 while(true)
    		 {
    			 System.out.println("==Choice==");
    			 System.out.println("1.push()\n2.pop()\n3.peek()\n4.search()\n5.exit");
    			 System.out.println("Enter the choice");
    			 int choice=s.nextInt();
    			 switch(choice)
    			 {
    			 case 1:
    				 System.out.println("Enter the element");
    				 st.push(new Integer(s.nextInt()));
    				 System.out.println(st.toString());
    				 break;
    			 case 2:
    				 if(st.empty())
    				 {
    					 System.out.println("stack is empty");
    				 }
    				 else {
    					 st.pop();//elelmt deleted from top of stack
    					 System.out.println(st.toString());
    				 }
    				 break;
    			 case 3:
    				 if(st.empty())
    				 {
    					 System.out.println("stack is empty");
    				 }
    				 else {
    					
    					 System.out.println("peek elemt:"+st.peek());
    					 System.out.println(st.toString());
    				 }
    				 break;
    			 case 4:
    				 if(st.empty())
    				 {
    					 System.out.println("stack is empty");
    				 }
    				 else {
    					
    					 System.out.println("enter the element to search");
    					 @SuppressWarnings("removal")
						Integer ele=new Integer(s.nextInt());
    					 int p=st.search(ele);
    					 if(p>0)
    					 {
    						 System.out.println("ele found at pos:"+p);
    						 
    					 }
    					 else {
    						 System.out.println("Element not found");
    					 }
    					 System.out.println(st.toString());
    				 }
    				 break;
    			 case 5:
    				 System.out.println("Stack operation stopped");
    				 System.exit(0);
    				 break;
    			 default:
    				 System.out.println("Invalid Choice");
    			 }
    		 }
    	 }catch(Exception e) {e.printStackTrace();}
     }
	}

}
