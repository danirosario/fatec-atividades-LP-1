//daniela de toledo rosario

import java.util.Scanner;

public class Fatorial_Exercicio43 
{
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int i = 0;
		int fatorial = 1;
		
		while (i < 7)
		{
			System.out.print("Entre com o " + (i + 1) + " para calcular o fatorial: ");
			int n = scan.nextInt();
			
			fatorial = fatorial * n;
			
			System.out.println("Fatorial de " + n + ": " + fatorial);
			System.out.println();
			
			i++;
		}
	}
}

