//daniela de toledo rosario

import java.util.Scanner;

public class Lista07_Exercicio05 
{	
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		String texto = "";
		int contador = 0;
		
		System.out.print("Entre com uma frase: ");
		
		texto = scan.nextLine();
		
		for (int i = 0; i < texto.length(); i++)
		{
			if (texto.charAt(i) == 'a' || texto.charAt(i) == 'A');
			{
				contador++;
			}	
		}
		System.out.println("O caractere 'a' aparece " + contador + " vezes.");
	}
}
