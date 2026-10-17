//daniela de toledo rosario
//exercicio 10

import java.util.Scanner;

public class Media10Valores 
{
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int numero   = 0;
		int soma     = 0;
		double media = 0.0;
		
		for (int i = 0; i < 10; i++)
		{
			System.out.print("Insira um valor: ");
			numero = scan.nextInt();
			
			soma = numero + soma;
		}
		media = (double)soma / 10;
		
		System.out.println("\nA media aritmetica dos numeros eh: " + media);
	}
}

