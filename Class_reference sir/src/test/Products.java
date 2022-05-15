package test;
public class Products 
{
	public String pCode,pName;
	float pPrice;
	int pQty;
	public void getProducts()
	{
		System.out.println("=======Product Details==========");
		System.out.println("Pcode :"+pCode);
		System.out.println("Pname :"+pName);
		System.out.println("Pprice :"+pPrice);
		System.out.println("Pqty :"+pQty);
	}
}