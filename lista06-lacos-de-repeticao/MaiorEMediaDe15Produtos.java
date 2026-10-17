//daniela de toledo rosario
//exercicio 22

import java.util.Scanner;

public class MaiorEMediaDe15Produtos 
{
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int codigo = 0;
		int totalProdutos = 15;
		double preco = 0.0;
		double maiorPreco = 0.0;
		double soma = 0.0;
		double media = 0.0;
		
		for (int i = 0; i < totalProdutos; i++)
		{
			System.out.print("Insira o codigo do " + (i+1) + " produto: ");
			codigo = scan.nextInt();
			
			System.out.print("Insira o preco do " + (i+1) + " produto: ");
			preco = scan.nextDouble();
			
			if (maiorPreco < preco)
			{
				maiorPreco = preco;
			}
			
			soma = soma + preco;
		}
		
		media = soma / totalProdutos;
		
		System.out.println();
		System.out.println("Maior preco: " + maiorPreco);
		System.out.println("Media aritmetica dos precos dos produtos: " + media);
	}
}

