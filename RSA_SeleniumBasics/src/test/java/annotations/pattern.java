package annotations;

public class pattern 
{
	public static void main(String[] args) 
	{
		int k=1;
		for(int i=1;i<=4;i++)
		{
			
			for(int j=i;j<=4;j++)
			{
				
				if(i<=j)
				{
					System.out.print(k+ " ");
					k++;
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
