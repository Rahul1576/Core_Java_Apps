package maccess;
import java.util.*;
public class Demo_Sorting {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	try(s;)
	{
		try {
			ArrayList<Integer>a1=new ArrayList<Integer>();
			System.out.println("Enter the no. of elements to be added to List<E>object:");
			int n=s.nextInt();
			System.out.println("Enter"+n+"Elements:");
			for(int i=1;i<=n;i++)
			{
				a1.add(new Integer(s.nextInt()));
			}
			System.out.println("Elements before sorting");
			System.out.println(a1.toString());
			System.out.println("choice for sorting");
			System.out.println("1.Array\n2.List<E>");
			System.out.println("Enter the choice");
			int choice=s.nextInt();
			switch(choice)
			{
			case 1:
				Object o[]=a1.toArray();//convert List<E>to Array
				Arrays.sort(o);
				System.out.println("after sorting process");
				System.out.println("Ascending order:");
				for(Object k:o)
				{
					System.out.println(k.toString()+" ");
				}
				System.out.println("\nDesending order:");
				for(int i=o.length-1;i>=0;i--)
				{
					System.out.println(o[i]+" ");
				}
				break;
			case 2:
				Collections.sort(a1);//sorting process
				System.out.println("After sorting process");
				System.out.println("Ascending order:"+a1.toString());
				System.out.println("\nDescending order:");
				for(int i=a1.size()-1;i>=0;i--)
				{
					System.out.println(a1.get(i)+" ");
				}
				break;
			default:
				System.out.println("Invalid choice");
			}
		}catch(Exception e) {e.printStackTrace();}
	}
	
	}

}
