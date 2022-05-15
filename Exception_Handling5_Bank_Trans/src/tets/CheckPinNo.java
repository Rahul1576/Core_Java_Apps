package tets;
@SuppressWarnings("serial")
public class CheckPinNo extends Exception
{
	public CheckPinNo() {}
	public CheckPinNo(String msg)
	{
		super(msg);
	}
	public void verify(int pinNo) throws CheckPinNo
	{
		try
		{
			if(!(pinNo==1111||pinNo==2222||pinNo==3333))//exception
			{
				CheckPinNo cpn2=new CheckPinNo("Invalid Pinno");
			throw cpn2;
			}
		}
		catch(CheckPinNo cpn2)
		{
			throw cpn2;
		}
	}
}