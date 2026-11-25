//daniela de toledo rosario

import java.util.Scanner;

public class Lista07_Exercicio22
{
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		String frase   = "";
		String palavra = "";
		int contador   =  0;
		
		System.out.print("Insira uma frase: ");
		frase = scan.nextLine().toLowerCase();
		
		System.out.print("Insira uma palavra: ");
		palavra = scan.nextLine().toLowerCase();
		
		if(!palavra.isEmpty())
		{
			for(int i = 0; i <= frase.length(); i++)
			{
				int pos = frase.indexOf(palavra, i);
				if (pos != -1)
				{
					contador++;
					i = pos;
				}
				else
				{
					break;
				}
			}
		}
		System.out.println("Quantidade de vezes que a palavra " + palavra + " aparece na frase: " + contador);
	}
}

