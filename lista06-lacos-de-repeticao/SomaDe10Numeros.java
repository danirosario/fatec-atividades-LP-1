//daniela de toledo rosario
//exercicio 12

import java.util.Scanner;

public class SomaDe10Numeros 
{
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int numero = 0;
		int soma   = 0;
		
		for (int i = 0; i < 10; i++)
		{
			System.out.print("Insira um valor para a soma: ");
			numero = scan.nextInt();
			
			soma = numero + soma;
		}
		System.out.println("\nSoma dos numeros: " + soma);
	}
}

