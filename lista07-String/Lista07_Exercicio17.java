//daniela de toledo rosario

import java.util.Scanner;

public class Lista07_Exercicio17 
{	
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		String frase1, frase2 = "";
		boolean frasesIguais = true;
		
		System.out.print("Insira a primeira frase: ");
		frase1 = scan.nextLine();
		
		System.out.print("Insira a segunda frase: ");
		frase2 = scan.nextLine();
		
		if (frase1.length() != frase2.length()) 
		{
			frasesIguais = false;
		} 
		else 
		{
			for (int i = 0; i < frase1.length(); i++) 
			{
				if (frase1.charAt(i) != frase2.charAt(i)) 
				{
					frasesIguais = false;
					break;
				}
			}
		}

		if (frasesIguais) 
		{
			System.out.println("As frases sao iguais.");
		} 	
		else 
		{
			System.out.println("As frases sao diferentes.");
		}
	}
}

