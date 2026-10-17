//daniela de toledo rosario
//exercicio 08

import java.util.Scanner;

public class NegativoDe10Valores 
{	
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int numero;
		int negativos = 0;
		
		for (int i = 0; i < 10; i++)
		{
			System.out.print("Insira um valor: ");
			numero = scan.nextInt();
			
			if( numero < 0)
			{
				negativos++;
			}
		}
		System.out.println("\nQuantidade de numeros negativos digitados: " + negativos);
	}
}

