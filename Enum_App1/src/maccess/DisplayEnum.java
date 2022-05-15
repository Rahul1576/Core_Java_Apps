package maccess;
public class DisplayEnum {
	public static void main(String[] args) {
		System.out.println("Display from Enum<E>");
		Cars c[]=Cars.values();//Generating Array
		for(Cars k:c)
		{
			System.out.println(k.toString()+" " +"Costs"+" "+k.getPrice()+" "+"Thousand Dollars");
		}
	}
}
