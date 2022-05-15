package test;
public class CheckPinno 
{
	public boolean k=false;
	public boolean verify(int pinNo)
	{
		switch(pinNo)
		{
		case 1111:k=true;
		break;
		case 2222:k=true;
		break;
		case 3333:k=true;
		break;
		case 4444:k=true;
		break;
		}
		return k;
	}

}
