package test;
import java.util.Date;
public class Translog {

	private final long hAccno,bAccno;
	private final float amt;
	private final Date d;
	public Translog(long hAccno,long bAccno,float amt,Date d)
	{
		this.hAccno=hAccno;
		this.bAccno=bAccno;
		this.amt=amt;
		this.d=d;
	}
	public final long gethAccno()
	{
		return hAccno;
	}
	public final long getbAccno()
	{
		return bAccno;
	}
	public final float getamt()
	{
		return amt;
	}
	public final Date getD()
	{
		return d;
	}
}
