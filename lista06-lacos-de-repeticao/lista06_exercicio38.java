//daniela de toledo rosario

import java.util.Scanner;

public class lista06_exercicio38 
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
                int i = 0;
                int j = 1;
				
				System.out.print(i + ", (" + i + "/" + j + "), ");
				
				i++;
				j++;
				
				while (i <= termos - 2) 
				{
					System.out.print(i + "/" + j);
					
					if (i < termos - 2) 
					{
						System.out.print(", ");
					}
					i++;
					j++;
				}
				System.out.println("\n");
			}
		}
	}
}

