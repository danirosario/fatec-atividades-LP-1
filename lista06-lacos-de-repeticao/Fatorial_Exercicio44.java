//daniela de toledo rosario

import java.util.Scanner;

public class Fatorial_Exercicio44 
{
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int fatorial = 1;
		
		System.out.print("Insira a quantidade de termos do fatorial: ");
		int numeroTermos = scan.nextInt();
		
		for (int i = 1; i <= numeroTermos; i++)
		{
			fatorial = fatorial * i;
			System.out.print(fatorial + " ");
		}
	}
}

