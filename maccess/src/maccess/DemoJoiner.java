package maccess;
import java.util.*;
public class DemoJoiner {

	public static void main(String[] args) 
	{
		StringJoiner sj1=new StringJoiner("/");
		sj1.add("12");
		sj1.add("oct");
		sj1.add("1998");
		System.out.println("sj1 : "+sj1.toString());
		StringJoiner sj2=new StringJoiner("-");
		sj2.add("nit");
		sj2.add("hyd");
		System.out.println("sj2 :" +sj2.toString());
		sj2.merge(sj1);
		System.out.println("sj2 :" +sj2.toString());
		

	}

}
