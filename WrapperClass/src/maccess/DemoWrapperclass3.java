package maccess;
public class DemoWrapperclass3 {

	public static void main(String[] args) {
    
		//Boxing process;
		Integer ob1=new Integer(12);
		Float ob2=new Float(12.35F);
		Character ob3=new Character('a');
		Boolean ob4=new Boolean(true);
         
		
		// Unboxing process;
		
		int i=ob1.intValue();
		float f=ob2.floatValue();
		char ch=ob3.charValue();
		boolean b=ob4.booleanValue();
		
		
		System.out.println("display values");
		System.out.println("int values :"+i);
		System.out.println("float values:"+f);
		System.out.println("char values :"+ch);
		System.out.println("boolean values :"+b);
	
	
	
	
	}

}
