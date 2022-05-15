package maccess;
import java.util.*;
public class Arrays1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try(s)
		{
			try {
				System.out.println("Enter the no of Integer object");
				int n=s.nextInt();
				Integer a[]=new Integer[n];
				System.out.println("Enter"+n+"Integer value");
				for(int i=0;i<a.length;i++)
				{
					a[i]=new Integer(s.nextInt());
				}
				System.out.println("\nDisplay using old for loop");
				for(int i=0;i<a.length;i++)
				{
					System.out.println(a[i].toString()+" ");
				}
				System.out.println("\nDisplay using Extended for(java 5)");
				for(Integer k:a)
				{
					System.out.println(k.toString()+" ");
				}
				System.out.println("\nDisplay using Spliterator<T> (java 8)");
				Spliterator<Integer> sp=Arrays.spliterator(a);
				sp.forEachRemaining((z)->
				{
					System.out.println(z.toString()+" "+"\t");	
				});

			}catch(Exception e) {e.printStackTrace();}
		}

	}

}
