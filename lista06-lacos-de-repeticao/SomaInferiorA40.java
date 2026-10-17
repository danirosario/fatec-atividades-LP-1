//daniela de toledo rosario
//exercicio 13

import java.util.Scanner;

public class SomaInferiorA40 
{
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int numero = 0;
		int soma   = 0;
		
		for (int i = 0; i < 10; i++)
		{
			System.out.print("Insira um numero: ");
			numero = scan.nextInt();
			
			if(numero < 40)
			{
				soma = numero + soma;
			}
		}
		System.out.println("Soma dos numeros inferiores a 40: " + soma);
	}
}

