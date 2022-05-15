package maccess;
public class Exception3_sleepmet {
	public static void main(String[] args) {
		for(int a=1;a<=10;a++)
		{
			try {
				System.out.println("Value :"+a);
				Thread.sleep(5000);
			}//end of try
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}//end catch
		}//end of loop

	}

}
