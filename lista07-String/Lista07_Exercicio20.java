//daniela de toledo rosario

import java.util.Scanner;

public class Lista07_Exercicio20
{
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		String frase = "";
		int palavras =  0;
		
		System.out.print("Entre com uma frase: ");
		frase = scan.nextLine().trim();
		
		palavras = frase.isEmpty() ? 0 : frase.split("\\s+").length;
		System.out.println("Numero de palavras: " + palavras);
	}
}

