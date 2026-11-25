//daniela de toledo rosario

import java.util.Scanner;

public class Lista07_Exercicio21
{
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		String frase = "";
		
		System.out.print("Entre com uma frase: ");
		frase = scan.nextLine();
		
		System.out.println(frase.replace(" ", "\n"));
	}
}

