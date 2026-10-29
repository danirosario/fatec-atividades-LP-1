//daniela de toledo rosario

public class lista06_exercicio30 
{	
	public static void main (String[] args) 
	{
		for (int i = 1; i <= 10; i++)
		{
			System.out.print(i + ", ");
			for (int j = 1; j <= i; j++)
			{
				if (i % 2 == 0)
				{
					System.out.print((2 * j) + " ");
				}
				else
				{
					System.out.print((2 * j - 1) + " ");
				}
			}
			System.out.println();
		}
	}
}
