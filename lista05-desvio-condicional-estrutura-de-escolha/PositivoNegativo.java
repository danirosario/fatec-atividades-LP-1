//daniela de toledo rosario

import java.util.Scanner;

public class PositivoNegativo 
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int numero = 0;
		
		System.out.print("Insira um numero: ");
		numero = scan.nextInt();
		
		if (numero % 2 == 0)
		{
			System.out.println("\nPositivo");
		}
		else
		{
			System.out.println("\nNegativo");
		}
	}
}

