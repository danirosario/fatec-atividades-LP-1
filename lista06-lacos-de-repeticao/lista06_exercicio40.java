//daniela de toledo rosario

import java.util.Scanner;

public class lista06_exercicio40
{
    public static void main (String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        
        int termos;
        
        while (true)
        {
            System.out.print("Digite a quantidade de termos (digite 0 para encerrar): ");
            termos = scan.nextInt();
            
            if(termos == 0)
            {
                System.out.println("Programa finalizado.");
                break;
            }
            else if (termos < 0)
            {
                System.out.println("Valor invalido! Nao sao aceitos numeros negativos.\n");
            }
            else 
            {
                System.out.print("Sequencia: ");
                int metade = termos / 2;
                
                int i = 1;
                while (i <= metade) 
                {
                    System.out.print(i);
                    i++;
                    
                    if (i <= metade) 
                    {
                        System.out.print(", ");
                    }
                }

                if (termos % 2 != 0)
                {
                    System.out.print(", " + (metade + 1));
                }

                int j = metade;
                while (j >= 1) 
                {
                    System.out.print(", ");
                    System.out.print(j);
                    j--;
                }
            }
            System.out.println("\n");
        }
        scan.close();
    }
}
