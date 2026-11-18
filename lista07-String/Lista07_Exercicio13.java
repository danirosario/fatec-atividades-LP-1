//daniela de toledo rosario

import java.util.Scanner;

public class Lista07_Exercicio13
{	
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("Insira uma frase: ");
		String frase = scan.nextLine().toLowerCase();
		
		for (char letra = 'a'; letra <= 'z'; letra++)
		{
			int contador = 0;
            
            for (int i = 0; i < frase.length(); i++) 
            {
                if (frase.charAt(i) == letra) 
                {
                    contador++;
                }
            }
			if ((letra != 'a') && (letra != 'e') && (letra != 'i') && (letra != 'o') && (letra != 'u'))
			{
				System.out.println(letra + ": " + contador);
			}
		}
		
	}
}

