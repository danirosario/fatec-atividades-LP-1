//daniela de toledo rosario

import java.util.Scanner;

public class lista06_exercicio32
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int termos;
        
        while (true) 
        {
            System.out.print("Digite a quantidade de termos (digite 0 para encerrar): ");
            termos = scan.nextInt();
            
            if (termos == 0) 
            {
                System.out.println("Programa finalizado.");
                break;
            } 
            else if (termos < 0) 
            {
                System.out.println("valor invalido! nao sao aceitos numeros negativos.\n");
            } 
            else 
            {
                System.out.print("Sequencia: ");
                int i = 1;
                while (i <= termos) 
                {
					if (i % 2 == 0)
					{
						System.out.print(i + " ");
					}
					i++;
                }
                System.out.println();
            }
        }
    }
}

