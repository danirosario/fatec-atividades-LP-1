//daniela de toledo rosario

import java.util.Scanner;

public class Lista07_Exercicio16 
{	
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		String frase = "";
		boolean todosMaiusculos = true;
		
		System.out.print("Insira uma frase: ");
		frase = scan.nextLine();
		
		for (char letra = 'a'; letra <= 'z'; letra++)
		{
            for (int i = 0; i < frase.length(); i++) 
            {
                if (frase.charAt(i) == letra) 
                {
					todosMaiusculos = false;
                    break;
                }
            }
		}
		if (todosMaiusculos)
		{
			System.out.println("Todos os caracteres da frase sao maiusculos");
		}
		else
		{
			System.out.println("Existem caracteres minusculos");
		}
	}
}

