package test;
@SuppressWarnings("serial")
public class checkPin extends Exception
{
	public int pin;
	public boolean k=false;
	
	public checkPin(String msg)
	{
		super(msg);
	}
		try {
				if(!(pin==1111||pin==2222))
				{
					checkPin cp=new checkPin("Incorrect Pin");
					throw cp;
				}
		}
		catch(checkPin cp)
		{
			System.out.println(cp.getMessage());
		}
	
}
}
