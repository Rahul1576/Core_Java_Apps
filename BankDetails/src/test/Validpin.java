package test;

public class Validpin 
{
	public boolean k=false;
	public boolean verify(String pin)
	{
		switch(pin)
		{
		case"1111":k=true;
		break;
		case"2222":k=true;
		break;
		case"3333":k=true;
		break;
		case"4444":k=true;
		break;
	    }
		return k;
	}

}
