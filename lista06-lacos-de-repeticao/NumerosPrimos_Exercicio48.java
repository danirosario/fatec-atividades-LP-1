//daniela de toledo rosario

import java.util.Scanner;

public class NumerosPrimos_Exercicio48
{    
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Insira a quantidade de termos: ");
        int termos = scan.nextInt();
        
        int contadorPrimos = 0;
        int numeroPrimo = 2;
  
        while (contadorPrimos < termos) 
        {
            boolean ehPrimo = true;
            int raiz = (int) Math.sqrt(numeroPrimo);

            for (int j = 2; j <= raiz; j++) 
            {
                if (numeroPrimo % j == 0) {
                    ehPrimo = false;
                    break;
                }
            }
            
            if (ehPrimo)
            {
                System.out.println(numeroPrimo);
                contadorPrimos++;
            }
            numeroPrimo++;
        }
    }
}
