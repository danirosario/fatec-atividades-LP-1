//daniela de toledo rosario

import java.util.Scanner;

public class Lista07_Exercicio14 
{	
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		String frase = "";
		String letra = "";
		String novaFrase = "";
		
		System.out.print("Insira uma frase: ");
		frase = scan.nextLine();
		
		System.out.print("Insira uma letra: ");
		letra = scan.nextLine();
		
		char caractereSubstituido = letra.charAt(0);
		
		for (int i = 0; i < frase.length(); i++)
		{
			if(frase.charAt(i) == caractereSubstituido)
			{
				char c = frase.charAt(i);
				novaFrase = frase.replace(c, '*');
			}
		}
		System.out.println(novaFrase);
	}
}
