package maccess;
public enum Cars {
     figo(900),alto(500),dezire(700);//elements
	public int price;
	private Cars(int price) {
		this.price=price;
	}
	public int getPrice()
	{
		return price;
	}
}
