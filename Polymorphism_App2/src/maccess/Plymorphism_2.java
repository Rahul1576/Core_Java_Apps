package maccess;
import test.*;
public class Plymorphism_2 {
	public static void main(String[] args) {
		//Ctest ob=new Ctest();//con_call error
		Ctest ob=Ctest.getRef();//Accessing the object reference
		ob.dis(123);

	}

}
