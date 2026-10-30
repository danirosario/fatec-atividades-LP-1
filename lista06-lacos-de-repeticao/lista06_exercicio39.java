//daniela de toledo rosario

import java.util.Scanner;

public class lista06_exercicio39 
{	
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int termos;
		
		while (true)
		{
			System.out.print("Digite a quantidade de termos (digite 0 para encerrar): ");
			termos = scan.nextInt();
			
			if(termos == 0)
			{
				System.out.println("Programa finalizado.");
				break;
			}
			else if (termos < 0)
			{
				System.out.println("valor invalido! nao sao aceitos numeros negativos.\n");
			}
			else 
			{
                System.out.print("Sequencia: ");
                int i = 1;
                int j = termos;
				int soma  = 0;
				int soma2 = 0;
				
				while (i <= termos) 
				{
					System.out.print(i + "/" + j);
					
					if (i < termos) 
					{
						System.out.print(" + ");
					}
					
					soma = soma + i;
					soma2 = soma2 + j;
					i++;
					j--;
				}
				System.out.println("\nsoma dos termos: " + soma + "/" + soma2 );
				System.out.println("\n");
			}
		}
	}
}

