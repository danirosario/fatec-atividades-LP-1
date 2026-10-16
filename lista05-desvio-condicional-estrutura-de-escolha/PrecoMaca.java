//daniela de toledo rosario

import java.util.Scanner;

public class PrecoMaca 
{	
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		double precoMacaUnidade = 1.30;
		double precoMacaSeDuzia = 1.00;
		double precoTotal = 0.0;
		int quantidadeMaca = 0;
		
		System.out.print("Insira a quantidade de macas: ");
		quantidadeMaca = scan.nextInt();
		
		if (quantidadeMaca < 12)
		{
			precoTotal = quantidadeMaca * precoMacaUnidade;
		}
		else
		{
			precoTotal = quantidadeMaca * precoMacaSeDuzia;
		}
		
		System.out.println("\nPreco total: " + precoTotal);
	}
}

