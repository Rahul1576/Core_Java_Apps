package test;
public class CheckPin {

	public boolean k=false;
	public boolean verify(int pin)
	{
		switch(pin)
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
