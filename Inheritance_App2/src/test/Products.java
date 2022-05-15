package test;
public class Products 
{
		public int pQty;
		public float pPrice;
		public String pCode;
		public String pName;
	
		public void getProduct()
		{
			System.out.println("========Product Details===========");
			System.out.println("Pcode :"+pCode);
			System.out.println("Pname :"+pName);
			System.out.println("Pprice :"+pPrice);
			System.out.println("Pqty :"+pQty);
		}
}
