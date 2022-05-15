package maccess;
import java.io.*;
public class Demo_De_Serialization {
	public static void main(String[] args) {
		try {
			File f=new File("D:\\objDate.txt");
			FileInputStream fis=new FileInputStream(f);
			ObjectInputStream ois=new ObjectInputStream(fis);
			Object ob2=ois.readObject();          //De-serialization process
			System.out.println("User Details");
			System.out.println(ob2.toString());
			ois.close();
		}catch(Exception e) {e.printStackTrace();}
	}
}