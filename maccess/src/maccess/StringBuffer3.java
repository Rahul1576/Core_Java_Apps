package maccess;

public class StringBuffer3 {

	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer("program");
		System.out.println("Default capacity :"+sb.capacity());
		System.out.println("Length :"+sb.length());
		sb.append("language");
		System.out.println("sb :"+sb.toString());
		System.out.println("capacity :"+sb.capacity());
		System.out.println("Length :"+sb.length());
		sb.append("Thread programimg");
		System.out.println("sb :"+sb.toString());
		System.out.println("capacity :"+sb.capacity());
		System.out.println("Length :"+sb.length());
		

	}

}
