package maccess;
import test.*;
import java.util.*;
public class Bank_mainclass 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int count=0;
		xyz:
			while(true)
			{
				System.out.println("Enter Pin");
				int pinNo=s.nextInt();
				boolean k=new CheckPinno().verify(pinNo);
				if(k)
				{
					System.out.println("===Choice===");
					System.out.println("1.Withdraw\n2.Deposit");
					System.out.println("Enter choice");
					int choice=s.nextInt();
					switch(choice)
					{
					case 1:
						System.out.println("Enter the amt");
						int a1=s.nextInt();
						if(a1>0 && a1%100==0)
							{
							WithDraw wd=new WithDraw();
							wd.process(a1);
							}//end of if
						
						else
						{
							System.out.println("Invalid Amount");
						}
						break xyz;//stop the loop
						
						
					case 2:
						System.out.println("Enter the amt :");
						int a2=s.nextInt();
						if(a2>0 && a2%100==0)
						{
							Deposit dp=new Deposit();
							dp.process(a2);
							
						}//end of if
						else
						{
							System.out.println("Invalid amt");
						}
						break xyz;
					default:
						System.out.println("Invalid choice");
						break xyz;//stop the loop
						
							}//end of Switch
				}//end of if
				else
				{
					System.out.println("Invalid pinno");
					count++;
				}
				if(count==3)
				{
					System.out.println("Sorry ! Transaction Blocked");
					break;//stop the loop
				}
			}
              s.close();
	}
}
