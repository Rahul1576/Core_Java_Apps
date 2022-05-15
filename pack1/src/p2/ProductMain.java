package p2;
import java.util.Scanner;
import p1.Product;
public class ProductMain 
{
     public static void main(String[] args)
	
	{

 Scanner s = new Scanner(System.in);
 System.out.println("Enter the PCode:");
 String pC = s.nextLine();
 System.out.println("Enter the PName:");
 String pN = s.nextLine();
 
 System.out.println("Enter the PPrice:");
 float pP = s.nextFloat();
 System.out.println("Enter the PQty:");
 int pQ = s.nextInt();
 Product p = new Product(pC,pN,pP,pQ); //Con_Call
 p.getProduct();
 s.close();
  }
}
