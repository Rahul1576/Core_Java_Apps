package Practice;
public class ShortingoFInteger 
{
	public static void main(String[] args) 
	{
	
		int[] arr= {4,8,1,2,88,55};
		int temp=0;
		int i,j;
		System.out.print("Shorted Values are :");
		for(i=0;i<arr.length;i++)
		{
			for(j=i;j<arr.length;j++)
			{
				if(arr[j]<arr[i])
				{
					temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
		    }
			//System.out.print("Shorted Values are :"+arr[i]);
			System.out.print(" "+arr[i]);
        }
		
	}
}
