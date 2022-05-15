package maccess;
import java.io.*;
import java.util.*;
public class Copy_File {
	public static void main(String[] args) {
		try {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the fpath & fname(Source)");
			File f1=new File(s.nextLine());
			if(f1.exists())
			{
				FileInputStream fis=new FileInputStream(f1);//constructor-call
				System.out.println("Enter the fpath & fname:(destination)");
				File f2=new File(s.nextLine());
				FileInputStream fos=new FileInputStream(f2);//constructor-call
				int k;//Jit compiler
				while((k=fis.read())!=-1)
				{
					fos.write(k);
				}//jit compiler
				System.out.println("File Copied Successfully");
				fos.close();
				fis.close();
				
			}
			else {
				System.out.println("Invalid fpath or fname");	
			}
			s.close();
		}catch(Exception e) {e.printStackTrace();}

	}

}
