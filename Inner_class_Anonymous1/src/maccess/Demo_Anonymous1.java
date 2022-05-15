package maccess;
import test.*;
public class Demo_Anonymous1 {

	public static void main(String[] args) {
		//Anonymous Innerclass as class extension
		Pclass ob=new Pclass()
		{
				public void m1(int x)
				{
				System.out.println("=====Cclass m1(x)===");
				System.out.println("X :"+x);
				}
		public void m3(int z)
		{
			System.out.println("=====Cclass m3(z)===");
			System.out.println("Z:"+z);
		}

	  };
	  ob.m1(12);
	  ob.m2(23);
	  //ob.m2(34);//error

}
}
