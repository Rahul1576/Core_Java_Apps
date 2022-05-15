package macces;
import java.util.*;
import test.*;
import java.util.function.*;
import java.sql.*;
public class Map1 {
	public static void main(String[] args) {
       try {
    	   Scanner s=new Scanner(System.in);
    	   Map<String,EmpValues>m=null;
    	   System.out.println("====choice===");
    	   System.out.println("1.HashMap\n2.LinkedHashMap\n3.TreeMap\n4.HashTable");
    	   System.out.println("Enter the choice");
    	   int choice=Integer.parseInt(s.nextLine());
    	   switch(choice)
    	   {
    	   case 1:
    		   m=new HashMap<String,EmpValues>();
    		   break;
    	   case 2:
    		   m=new LinkedHashMap<String,EmpValues>();
    		   break;
    	   case 3:
    		   m=new TreeMap<String,EmpValues>();
    		   break;
    	   case 4:
    		   m=new Hashtable<String,EmpValues>();
    		   break;
    	default:
    		 System.out.println("Invalid choice");
    	   }
    	   Class.forName("oracle.jdbc.driver.OracleDriver");
    	   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","c##javadb1","javadb1");
           PreparedStatement ps=con.prepareStatement("select * from emp44");
           ResultSet rs=ps.executeQuery();
           while(rs.next())
           {
        	   m.put(new String(rs.getString(1)),new EmpValues(rs.getString(2),rs.getString(3),rs.getInt(4)));
        	   
           }
           System.out.println("Display Map<K,V>");
           m.forEach((p,q)->
           {
        	   System.out.println(p.toString()+"\t"+q.toString());  
           });
           System.out.println("==key data===");
           Set<String>st=m.keySet();
           st.forEach((k)->{
        	   System.out.println(k.toString()); 
           });
           System.out.println("==values data==");
           Collection<EmpValues>c=m.values();
           c.forEach((k)->{
        	   System.out.println(k.toString());
           });
           System.out.println("Display based on Empid");
           System.out.println("Enter the empid");
           String eId=s.nextLine();
           BiPredicate<String,EmpValues>bq=(s1,s2)->
           {
        	   return s1.toString().equals(eId);
           };
           m.forEach((g,h)->
           {
        	   if(bq.test(g,h))
        	   {
        		   System.out.println(g.toString()+"\t"+h.toString());
        	   }
           });
           s.close();
       }catch(Exception e) {e.printStackTrace();}
	}

}
