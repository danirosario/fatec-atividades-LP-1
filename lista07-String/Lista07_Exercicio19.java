//daniela de toledo rosario

import java.util.Scanner;

public class Lista07_Exercicio19 
{
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		String palavra = "";
		String palavraInversa = "";
		
		System.out.print("Entre com uma palavra: ");
		palavra = scan.nextLine();
		
		for(int i = 0; i < palavra.length(); i++)
		{
			palavraInversa = palavra.charAt(i) + palavraInversa;
		}
		
		System.out.println("\nPalavra digitada: " + palavra + "\nPalavra Invertida: " + palavraInversa);
		
		if(palavra.equalsIgnoreCase(palavraInversa))
		{
			System.out.println("Eh um palindromo");
		}
		else
		{
			System.out.println("Nao eh um palindromo");
		}
	}
}

