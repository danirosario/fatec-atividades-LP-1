//daniela de toledo rosario

import java.util.Scanner;

public class VerificaValorProduto 
{	
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int valorProduto1, valorProduto2;
		
		System.out.print("Entre com o valor do primeiro produto: ");
		valorProduto1 = scan.nextInt();
		
		if (valorProduto1 < 1 || valorProduto1 > 1000) 
		{
			System.out.println("VALOR INVALIDO");
			return;
		}
		
		System.out.print("Entre com o valor do segundo produto: ");
		valorProduto2 = scan.nextInt();
		
		if (valorProduto2 < 1 || valorProduto2 > 1000)
		{
			System.out.println("VALOR INVALIDO");
			return;
		}
		
		if (valorProduto1 < valorProduto2)
		{
			System.out.println("O produto 1 eh o mais barato");
		}
		else if (valorProduto1 > valorProduto2)
		{
			System.out.println("O produto 2 eh o mais barato");
		}
		else
		{
			System.out.println("Os precos dos dois produtos sao iguais");
		}
	}
}

