package maccess;
import test.*;
import java.util.Scanner;
public class StudentMain 
{
 public static void main(String[] args) 
	{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the student name :");
			String StuName=s.nextLine();
			System.out.println("Enter student Branch:");
			String StuBranch=s.nextLine().toUpperCase();
			
			CheckBranch cb=new CheckBranch();
			boolean k=cb.verify(StuBranch);
	if(k)
	{
		System.out.println("Enter Roll Number:");
		String rollNo=s.nextLine().toUpperCase();
		if(rollNo.length()==10)
		{
			validateRollno vrn=new validateRollno();
			boolean z=vrn.verify(StuBranch,rollNo.substring(6,8));
			if(z)
			{
				int i=1,totmarks=0;//initialization
				boolean p=false;
				System.out.println("Enter Marks of 6 sub:");
				while(i<=6)//condition
				{
					System.out.println("Enter subject:"+i);
					int sub=s.nextInt();
					if(sub<0||sub>100)
					{
						System.out.println("Invalid Marks");
						continue;//skip the below lines from loop
					}
					if(sub>=0 && sub<=34)
					{
						p=true;
					}
					totmarks=totmarks+sub;
					i++;
				}//end of while
				System.out.println("Student Name : "+StuName);
				System.out.println("Branch : "+StuBranch);
				System.out.println("Roll No : "+rollNo);
				System.out.println("Total Marks : "+totmarks);
			StudentResult sr=new StudentResult();
			sr.calculate(totmarks,p);
			sr.getStudentResult();
			}//end of if
			else
			{
				System.out.println("Roll No Not Matched With Branch");
			}
		}//end of if
		else
		{
			System.out.println("Invalid Roll Number ");
		}
	} //end of if
	else {
		System.out.println("Invalid Branch");
	}
		s.close();
	}
}