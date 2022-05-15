package maccess;
public class Demo_Exception5 
{
	@SuppressWarnings("null")
	public static void main(String[] args) 
	{
		String str=null;
		int len=str.length();
		System.out.println("Str :"+str.toString());
		System.out.println("Length :"+len);
		//this program is to raise the nullPinterexception.
		//output=========
		//Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" 
		//because "str" is null
		//at maccess.Demo_Exception5.main(Demo_Exception5.java:8)

	}
}
