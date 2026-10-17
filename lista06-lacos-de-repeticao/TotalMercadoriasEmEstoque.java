//daniela de toledo rosario
//exercicio 18

import java.util.Scanner;

public class TotalMercadoriasEmEstoque 
{
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int quantidadeTotalMercadorias = 0;
		double valorMercadoria = 0.0;
		double valorTotalDeMercadorias = 0.0;
		
		System.out.print("Insira a quantidade total de mercadorias: ");
		quantidadeTotalMercadorias = scan.nextInt();
		
		for(int i = 0; i < quantidadeTotalMercadorias; i++)
		{
			System.out.print("Insira o valor da " + (i+1) + " mercadoria: ");
			valorMercadoria = scan.nextDouble();
			
			valorTotalDeMercadorias = valorTotalDeMercadorias + valorMercadoria;
		}
		
		System.out.println("\nO valor total das mercadorias em estoque eh de: " + valorTotalDeMercadorias);
	}
}

