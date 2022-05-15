package test;
public class validateRollno
{
	public boolean z=false;
	public String branch=null;
	public boolean verify(String br,String code)
	{
		switch(code)
		{
		case "05":branch="CSE";
		break;
		case "04":branch="ECS";
		break;
		case "02":branch="EEE";
		break;
		}//end of switch
		if(branch!=null)
		{
			if(br.equals(branch))
			{
				z=true;
			}
		}//end of if
		return z;
	}

}
