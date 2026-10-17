//daniela de toledo rosario
//exercicio 21

import java.util.Scanner;

public class MaiorEMedia 
{
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int quantidadeNum = 0;
		int num = 0;
		int maior = 0;
		int soma = 0;
		double media = 0.0;
		
		System.out.print("Insira a quantidade de numeros: ");
		quantidadeNum = scan.nextInt();
		
		for (int i = 0; i < quantidadeNum; i++)
		{
			System.out.print("Digite um numero: ");
			num = scan.nextInt();
			
			if (maior < num)
			{
				maior = num;
			}
			
			soma = soma + num;
		}
		media = (double)soma / quantidadeNum;
		
		System.out.println("Media dos numeros: " + media);
		System.out.println("Numero maior: " + maior);
	}
}

