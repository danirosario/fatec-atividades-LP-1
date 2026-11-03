//daniela de toledo rosario

import java.util.Scanner;

public class NumerosPrimos_Exercicio49
{    
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        
        int contadorPrimos = 0;
        int numeroPrimo = 2;
        int termos;

        System.out.print("Insira a quantidade de termos: ");
        termos = scan.nextInt();

        int listaNumerosPrimos[] = new int[termos];
  
        while (contadorPrimos < termos) 
        {
			boolean ehPrimo = true;
            int raiz = (int) Math.sqrt(numeroPrimo);

            for (int i = 2; i <= raiz; i++) 
            {
                if (numeroPrimo % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
            
            if (ehPrimo)
            {
                listaNumerosPrimos[contadorPrimos] = numeroPrimo;
                contadorPrimos++;
            }
            numeroPrimo++;
        }
        
        for (int j = contadorPrimos - 1; j >= 0; j--) 
        {
            System.out.println(listaNumerosPrimos[j]);
        }
    }
}
