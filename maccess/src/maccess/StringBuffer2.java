package maccess;

public class StringBuffer2 {

	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer(4);
		System.out.println("Default capacity :"+sb.capacity());
		System.out.println("Length :"+sb.length());
		sb.append("nit");
		System.out.println("sb :"+sb.toString());
		System.out.println("capacity :"+sb.capacity());
		System.out.println("Length :"+sb.length());
		sb.append("hyd");
		System.out.println("sb :"+sb.toString());
		System.out.println("capacity :"+sb.capacity());
		System.out.println("Length :"+sb.length());
		

	}

}
