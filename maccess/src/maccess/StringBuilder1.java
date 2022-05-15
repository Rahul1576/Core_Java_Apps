package maccess;

public class StringBuilder1 {

	public static void main(String[] args) 
	{
		StringBuilder sb=new StringBuilder(); // const _call
        System.out.println("default capacity :"+sb.capacity());
        System.out.println("length :"+sb.length());
        sb.append("java");
        System.out.println("sb:"+sb.toString());
        System.out.println("capacity :"+sb.capacity());
        System.out.println("length :"+sb.length());
        sb.append("program");
        System.out.println("sb:"+sb.toString());
        System.out.println("capacity :"+sb.capacity());
        System.out.println("length :"+sb.length());
        sb.append("language"); 
        System.out.println("sb:"+sb.toString());
        System.out.println(" capacity :"+sb.capacity());
        System.out.println("length :"+sb.length());
	}

}
