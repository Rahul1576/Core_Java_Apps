package maccess;
public class DemoWrapperclass1 {

	public static void main(String[] args) 
	{
		//Boxing Process
		@SuppressWarnings("removal")
		Integer ob1=new Integer(12);//const call with int para
		Integer ob2=new Integer("13");
		//cons call with int in the form of string...
		System.out.println("=============Display from Objects=========");
		System.out.println("Ob1 :"+ob1.toString());
		System.out.println("Ob2 :"+ob2.toString());

	}

}
