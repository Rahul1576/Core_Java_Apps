package test;
public class Producer implements Runnable
{
		public StringBuffer sb;
		public Producer()
		{
			sb=new StringBuffer();
		}
		public void run()
		{
			synchronized(sb)
			{
				try {
					for(int i=1;i<=10;i++)
					{
						sb.append(i+" ");
						System.out.println("Producer Appending data");
						Thread.sleep(2000);
					}
					sb.notify();//retrieve the buffer and send message
				}catch(Exception e) {e.printStackTrace();}
			}//end of block
		}
}