package maccess;

public class StringBuffer_4 {

	public static void main(String[] args) {
		
		StringBuffer sb1=new StringBuffer("nit");
		StringBuffer sb2=new StringBuffer(sb1);
		System.out.println("sb2 :"+sb2.toString());
		System.out.println("Default capacity :"+sb2.capacity());
		System.out.println("Length :"+sb2.length());
		sb1.append("hyd");
		System.out.println("sb2 :"+sb2.toString());
		
		System.out.println("capacity :"+sb2.capacity());
		System.out.println("Length :"+sb2.length());
	
		

	}

}
