//daniela de toledo rosario
//exercicio 24

public class TabuadaDo0Ao10 
{
	public static void main (String[] args) 
	{
		int resultado = 0;
		int i, j = 0;
		
		for (i = 1; i <= 10; i++)
		{
			for (j = 0; j <= 10; j++)
			{
				resultado = i*j;
				System.out.println(i + "x" + j + "=" + resultado);
			}
			System.out.println();
		}
	}
}
