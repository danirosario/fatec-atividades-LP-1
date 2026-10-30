//daniela de toledo rosario

import java.util.Scanner;

public class Lista07_Exercicio06 
{	
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		String texto = "";
		String letra = "";
		int contador = 0;
		
		System.out.print("Entre com uma frase: ");
		texto = scan.nextLine();
		
		System.out.print("Entre com uma letra: ");
		letra = scan.nextLine().toLowerCase();
		
		for (int i = 0; i < texto.length(); i++)
		{
			if (texto.charAt(i) == letra);
			{
				contador++;
			}	
		}
		System.out.println("O caractere " + letra + " aparece " + contador + " vezes.");
	}
}

