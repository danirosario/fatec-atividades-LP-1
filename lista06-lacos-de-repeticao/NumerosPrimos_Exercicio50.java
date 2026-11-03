//daniela de toledo rosario

import java.util.Scanner;

public class NumerosPrimos_Exercicio50 
{	
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int contador = 0;
		int termos = 0;
		int termoInicial = 0;
		
		System.out.print("Insira a quantidade de termos: ");
		termos = scan.nextInt();
		
		System.out.print("Insira o termo inicial: ");
		termoInicial = scan.nextInt();
		
		while(contador < termos)
		{
			boolean ehPrimo = true;
			int raiz = (int) Math.sqrt(termoInicial);
			
			for (int i = 2; i <= raiz; i++)
			{
				if(termoInicial % i == 0)
				{
					ehPrimo = false;
					break;
				}
			}
			if (ehPrimo)
			{
				System.out.println(termoInicial);
				contador++;
			}
			termoInicial++;
		}
	}
}

