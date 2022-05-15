package maccess;
public class StringBuffer1 {

	public static void main(String[] args)
	{
		StringBuffer sb=new StringBuffer();
		System.out.println("default capacity :"+sb.capacity());
		System.out.println("Length:"+sb.length());
		sb.append("java");
		System.out.println("sb:"+sb.toString());
		System.out.println("capacity:"+sb.capacity());
		System.out.println("length:"+sb.length());
		sb.append("programming");
		
		System.out.println("capacity:"+sb.capacity());
		System.out.println("length:"+sb.length());
		sb.append("language");
		System.out.println("capacity:"+sb.capacity());
		System.out.println("length:"+sb.length());
		


	}


	
}
