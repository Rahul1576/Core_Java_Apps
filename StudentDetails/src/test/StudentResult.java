package test;
public class StudentResult
{
	public float per;
	public String result;
	public void calculate(int totmarks,boolean p)
	{
		per=(float)totmarks/6;//type casting
		if(p)
		{
			result="Fail";
		}
		else if(per>=70 && per<=100)
		{
			result="Distinction";
		}
		else if(per>=60 && per<70)
		{
			result="First Class";
		}
		else if(per>=50 && per<60)
		{
			result="Second Class";
		}
		else if(per>=35 && per<50)
		{
			result="Third Class";
		}
		else
		{
			result="Fail";
		}
	}
	public void getStudentResult()
	//non-return type Instance Method Without Parameters
	{
		System.out.println("Percentage:"+per);
		System.out.println("Result:"+result);
	}
}