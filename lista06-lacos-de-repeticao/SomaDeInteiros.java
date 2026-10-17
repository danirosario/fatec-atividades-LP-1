//daniela de toledo rosario
//exercicio 14

import java.util.Scanner;

public class SomaDeInteiros 
{
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int numero1 = 0;
		int numero2 = 0;
		int soma    = 0;
		
		System.out.print("Insira o primeiro numero: ");
		numero1 = scan.nextInt();
		
		System.out.print("Insira o segundo numero: ");
		numero2 = scan.nextInt();
		
		for (int i = numero1; i <= numero2; i++)
		{
			soma += i;
		} 
		
		System.out.println(soma);
	}
}

