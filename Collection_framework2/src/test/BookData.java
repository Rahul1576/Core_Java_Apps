package test;
@SuppressWarnings("rawtypes")
public class BookData implements Comparable {
   public String bCode,bName,bAuthor;
   public float bPrice;
   public int bQty;
   public BookData(String bCode,String bName,String bAuthor,float bPrice,int bQty)
   {
	   this.bCode=bCode;
	   this.bName=bName;
	   this.bAuthor=bAuthor;
	   this.bPrice=bPrice;
	   this.bQty=bQty;
   }
   public String toString()
   {
	   return bCode+"\t"+bName+"\t"+bAuthor+"\t"+bPrice+"\t"+bQty;
   }
   public int compareTo(Object o)
   {
	   BookData bd=(BookData)o;
	   int z=bCode.compareTo(bd.bCode);
	   if(z==0)return z;
	   else if(z>0)return 1;
	   else return -1;
   }
}
