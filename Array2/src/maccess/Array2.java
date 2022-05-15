package maccess;
import java.util.*;
import test.*;
public class Array2 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		try(s)
		{
			try {
				System.out.println("Enter no of products");
				int n=Integer.parseInt(s.nextLine());
				Product a[]=new Product[n];
				System.out.println("Enter"+n+"Integer Element");
				for(int i=0;i<a.length;i++)
				{
					System.out.println("Enter the productcode");
					String pCode=s.nextLine();
					System.out.println("Enter the productName");
					String pName=s.nextLine();
					System.out.println("Enter the productprice");
					float pPrice=Float.parseFloat(s.nextLine());
					System.out.println("Enter the productQty");
					int pQty=Integer.parseInt(s.nextLine());
				
					a[i]=new Product(pCode,pName,pPrice,pQty);
				}
				System.out.println("Display using old for loop");
				for(int i=0;i<a.length;i++)
				{
					System.out.println(a[i].toString()+" ");
				}
				System.out.println("Display using Extended for(java 5)");
				for(Product k:a)
				{
					System.out.println(k.toString()+" ");
				}
				System.out.println("Display using Spliterator<T> (java 8)");
				Spliterator<Product> sp=Arrays.spliterator(a);
				sp.forEachRemaining((z)->
				{
					System.out.println(z.toString()+" ");	
				});
			}
			catch(Exception e) {e.printStackTrace();}
		}

	}

}
