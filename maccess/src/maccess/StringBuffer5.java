package maccess;

public class StringBuffer5 {

	public static void main(String[] args) {
	
		StringBuffer sb=new StringBuffer("language");
		sb.insert(2,"nit");
		System.out.println("sb :"+sb.toString());
		sb.reverse();
		System.out.println("sb :"+sb.toString());

	}

}
