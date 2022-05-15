package test;
public class Pdisplay {
		private int k=10;
		private void dis()
		{
			System.out.println("==Private method dis()");
			System.out.println("The value k:"+k);
		}
		public void m()
		{
			this.dis();//private method call
		}
}
