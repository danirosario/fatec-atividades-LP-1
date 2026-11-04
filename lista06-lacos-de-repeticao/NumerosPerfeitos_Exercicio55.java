//daniela de toledo rosario

import java.util.Scanner;

public class NumerosPerfeitos_Exercicio55
{	
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira um numero: ");
		int n = scan.nextInt();
		
		int soma = 0;
		
		for (int i = 1; i <= n / 2; i++)
		{
			if (n % i == 0)
			{
				soma += i;
			}
		}
		
		if (soma == n) 
		{
            System.out.println(n + " eh um numero perfeito!");
        } 
        else 
        {
            System.out.println(n + " NAO eh um numero perfeito.");
        }
	}
}

