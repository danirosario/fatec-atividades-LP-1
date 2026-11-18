//daniela de toledo rosario

import java.util.Scanner;

public class Lista07_Exercicio15 
{	
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		String frase = "";
		int contador = 0;
		
		System.out.print("Insira uma frase: ");
		frase = scan.nextLine();
		
		for (char numero = '0'; numero <= '9'; numero++) 
        {
            for (int i = 0; i < frase.length(); i++) 
            {
                if (frase.charAt(i) == numero) 
                {
                    contador++;
                }
            }
        }
        
        if (contador > 0) 
        {
            System.out.println("Sim, existem " + contador + " caracteres numericos");
        }
        else 
        {
			System.out.println("Nao existem caracteres numericos!");
		}
	}
}

