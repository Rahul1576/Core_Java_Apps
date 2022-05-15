package test;
import java.util.Scanner;
public class Child_1 extends Abstract_method
{
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		
		System.out.println("enter one int value");
		int a=sc.nextInt();
		System.out.println("enter one float value");
		float b=sc.nextFloat();
		System.out.println("a :" +a+"\t" +"b :"+b);
	}

}
