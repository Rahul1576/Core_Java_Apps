package test;
public class Display 
{
	public Products p=null;//reference _variable
	public Display(Products prod)
	{
		p=prod;
	}
	public void dis()
	{
		p.getProducts();
	}

}