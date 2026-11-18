//daniela de toledo rosario

import java.util.Scanner;

public class Lista07_Exercicio10 
{	
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		String frase = "";
		int contador =  0;
		
		System.out.print("Insira uma frase: ");
		frase = scan.nextLine();
		
		for (char letra = 'A'; letra <= 'Z'; letra++)
		{
			for (int i = 0; i < frase.length(); i++)
			{
				if(frase.charAt(i) == letra)
				{
					contador++;
				}
			}
		}
		System.out.println("Total de letras maiusculas: " + contador);
	}
}

