package test;
import java.io.*;
public class DemoFile2 {
	public static void main(String[] args) {
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			File f=new File("D:\\cmdjava\\text.txt");
			FileWriter fw=new FileWriter(f);//creating file
			char ch1;
			System.out.println("Enter the data:(@ at end)");
			while((ch1=(char)br.read())!='@')
			{
				fw.write(ch1);//writing the data to file
				
			}
			System.out.println("Data stored Successfull");
			fw.close();
			System.out.println("Display the data from file");
			int k;
			FileReader fr=new FileReader(f);//opening the file
			while((k=fr.read())!=-1)
			{
				System.out.println((char)k);//Displaying to console
			}
			fr.close();
			br.close();
		}catch(Exception e) {e.printStackTrace();}

	}

}
