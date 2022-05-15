package p2;
import java.util.*;
import p1.add;
import p1.sub;
import p1.mult;
import p1.div;
import p1.modiv;

public class Arithmeticopr {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
	    System.out.println("Press '1'. For operation with same value\n "
			+ "Press '2'. For operation with different value");

		int choice=s.nextInt(); 
		//String choice=p;
		System.out.println("Enter Choice");
	switch(choice)
	{
	
	case 1:
					System.out.println("enter First value ");
					int v1=s.nextInt();
					System.out.println("enter Second value ");
					int v2=s.nextInt();
		
					
					
					System.out.println("Press 1.add\t2.sub\t3.mult\t4.div\t5.moddiv");
					do 
					{
					System.out.println("Enter Choice");
					int choice1=s.nextInt();
					
					
						switch(choice1)
						{
									case 1:
										add ad=new add(v1,v2);
										break;
									case 2:
										sub sb=new sub(v1,v2);
										break;
									case 3:
										mult ml=new mult(v1,v2);
										break;
									case 4:
										div di=new div(v1,v2);
										break;
										
									case 5:
									modiv div=new modiv(v1,v2);
									break;
						
									default:
								    System.out.println("Invalid Choice");
								  break;
								  
									
					    }
						
						}while(true);
				
						
						
	
									
								
				
		                 
					
	                    
	
		
		
	
	
	case 2:
			do 
			{
			System.out.println("enter First value ");
			int v3=s.nextInt();
			System.out.println("enter Second value ");
			int v4=s.nextInt();
			
			
			//System.out.println("With Same Value");
			System.out.println("Press 1.add\t2.sub\t3.mult\t4.div\t5.moddiv");
			System.out.println("Enter Choice");
			int choice2=s.nextInt();
			
						switch(choice2)
						{
						case 1:
							add ad=new add(v3,v4);
							break;
						case 2:
							sub sb=new sub(v3,v4);
							break;
						case 3:
							mult ml=new mult(v3,v4);
							break;
						case 4:
							div di=new div(v3,v4);
							break;
							
						case 5:
						modiv div=new modiv(v3,v4);
						break;
							
						default:
				        System.out.println("Invalid Choice");
						}
						}while(true);
						
					
	
			
	default:
	        System.out.println("Invalid Choice");

		}
	}
}
