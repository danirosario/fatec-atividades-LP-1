/*CODIGO PREGUIÇOSO DE IA*/

import java.util.Scanner;

public class NumerosPrimosInverso 
{    
    public static void main (String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int qntTermos = 0;
        
        while(true)
        {
            System.out.print("\nInsira a quantidade de termos: ");
            qntTermos = scan.nextInt();
            
            if (qntTermos == 0)
            {
                System.out.println("Fim do programa!");
                break;
            }
            if (qntTermos < 0)
            {
                System.out.println("Quantidade Invalida!");
                continue;
            }
            
            // Passo 1: Encontrar o valor do N-ésimo número primo de forma procedural
            int contadorPrimos = 0;
            int numeroAtual    = 1;
            int nEsimoPrimo    = 0;

            while (contadorPrimos < qntTermos) 
            {
                numeroAtual++;
                boolean ehPrimo = true;
                int raiz = (int) Math.sqrt(numeroAtual);
                
                for (int j = 2; j <= raiz; j++) 
                {
                    if (numeroAtual % j == 0) 
                    {
                        ehPrimo = false;
                        break;
                    }
                }
                
                if (ehPrimo) 
                {
                    contadorPrimos++;
                    nEsimoPrimo = numeroAtual;
                }
            }

            // Passo 2: Percorrer de trás para frente a partir do N-ésimo primo até 2

            for (int i = nEsimoPrimo; i >= 2; i--) 
            {
                boolean ehPrimo = true;
                int raiz = (int) Math.sqrt(i);
                
                for (int j = 2; j <= raiz; j++) 
                {
                    if (i % j == 0) 
                    {
                        ehPrimo = false;
                        break;
                    }
                }
                
                if (ehPrimo) 
                {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
        scan.close();
    }
}
