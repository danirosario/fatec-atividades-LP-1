//daniela de toledo rosario

public class lista06_exercicio29 
{
	public static void main (String[] args) 
	{
		for (int i = 1; i <= 10; i++)
		{
			System.out.print(i + ", ");
			for (int j = 1; j <= 5; j++)
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
