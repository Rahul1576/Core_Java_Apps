package maccess;
import test.*;
import java.util.*;
public class Bank_Transactions 
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int count=0;
		xyz:
			while(true)
			{
				System.out.println("Enter the pin");
				int pinno=s.nextInt();
				boolean k=new CheckPin().verify(pinno);
				if(k)
				{
					System.out.println("====choice====");
					System.out.println("1.Withdraw\t2.Deposit");
					System.out.println("Enter the choice");
					int choice=s.nextInt();
					switch(choice)
					{
					case 1:
						System.out.println("Enter the amt");
						int a1=s.nextInt();
						if(a1>0&&a1%100==0)
						{
							Transactions wd=(int amt)->
							{
								
								if(amt<=Transactions.b.bal)
								{
									System.out.println("Amt withdwa "+amt);
									Transactions.b.bal=Transactions.b.bal-amt;
									Transactions.b.getBalance();
									System.out.println("Transactions completed");
									
								}
								
								else
								{
									System.out.println("Insufficient fund");
								}
								
							};
							wd.process(a1);
						}
						else
						{
							System.out.println("Invalid amt");
						}
						break xyz;
					case 2:
						System.out.println("Enter the amt");
						int a2=s.nextInt();
						if(a2>0&&a2%100==0)
						{
							Transactions dp=(int amt)->
							{
									System.out.println("Amt withdwa "+amt);
									Transactions.b.bal=Transactions.b.bal+amt;
									Transactions.b.getBalance();
									System.out.println("Transactions completed");
							};
							dp.process(a2);
						}
								
								else
								{
									System.out.println("Insufficient fund");
								}
						break xyz;
						
						default:
							System.out.println("Invalid choice");
							break xyz;
					}//end of switch
				}//end of if
				
				else
				{
					System.out.println("Invalid pin");
					count++;
					
				}
				if(count==3)
				{
					System.out.println("soryy try again");
					break;
				}
			}
		s.close();

	}

}
