package p1;

public class Product 
{
	
		 public String pCode,pName;
		 public float pPrice;
		 public int pQty;
		 public Product(String a,String b,float c,int d)
		 {
		pCode=a;
		pName=b;
		pPrice=c;
		pQty=d;
		 }
		 public void getProduct()
		 {
		 System.out.println("====ProductDetails===");
		 System.out.println("PCode:"+pCode);
		 System.out.println("PName:"+pName);
		 System.out.println("PPrice:"+pPrice);
		 System.out.println("PQty:"+pQty);
		 
		 }
	}

