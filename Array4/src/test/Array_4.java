package test;
import java.util.*;
public class Array_4 {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	try(s;)
	{
		try {
			System.out.println("Enter the size of Array1");
			int n1=s.nextInt();
			Integer a1[]=new Integer[n1];
			//Integer a2[]=new Integer[n2];
			System.out.println("Enter"+n1+"Elements for array1");
			for(int i=0;i<a1.length;i++)
			{
				a1[i]=new Integer(s.nextInt());
			}
			System.out.println("Enter"+n2+"Elements for array2");
			for(int i=0;i<a2.length;i++)
			{
				a2[i]=new Integer(s.nextInt());
			}
			Integer a[][]= {a1,a2};//jagged Array
			System.out.println("Display from jagged Array");
			for(Integer k[]:a)
			{
				System.out.println("Array");
				for(Integer z:k)
				{
					System.out.println(z.toString()+" ");
				}
				System.out.println();
			}//end of outer loop
		}catch(Exception e) {e.printStackTrace();}
	}//end of try
	}
}
//not run