//daniela de toledo rosario
//exercicio 19

import java.util.Scanner;

public class TotalMercadoriasEmEstoqueS_N
{
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		double valorMercadoria = 0.0;
		double valorTotalDeMercadorias = 0.0;
		char continuar = 'S';
		
		while (continuar == 'S')
		{
			System.out.print("Insira o valor da mercadoria: ");
			valorMercadoria = scan.nextDouble();
			
			valorTotalDeMercadorias = valorTotalDeMercadorias + valorMercadoria;
			
			System.out.print("MAIS MERCADORIAS (S/N)? ");
			continuar = scan.next().toUpperCase().charAt(0);
		}
		
		System.out.println("\nO valor total das mercadorias em estoque eh de: " + valorTotalDeMercadorias);
	}
}

