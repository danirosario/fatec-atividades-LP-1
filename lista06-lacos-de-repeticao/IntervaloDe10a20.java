//daniela de toledo rosario
//exercicio 09

import java.util.Scanner;

public class IntervaloDe10a20 
{	
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int numero = 0;
		int numerosEntre10e20 = 0;
		int numerosQueNaoEntre10e20 = 0;
		
		for (int i = 0; i < 10; i++)
		{
			System.out.print("Insira um valor: ");
			numero = scan.nextInt();
			
			if( numero >= 10 && numero <= 20)
			{
				numerosEntre10e20++;
			}
			else 
			{
				numerosQueNaoEntre10e20++;
			}
		}
		System.out.println("Quantidade de numeros que estao entre 10 a 20: " + numerosEntre10e20);
		System.out.println("Quantidade de numeros que NAO estao entre 10 a 20: " + numerosQueNaoEntre10e20);
	}
}

