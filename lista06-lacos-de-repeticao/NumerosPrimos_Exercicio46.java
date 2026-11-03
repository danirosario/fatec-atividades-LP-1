//daniela de toledo rosario

import java.util.Scanner;

public class NumerosPrimos_Exercicio46 
{
    
    public static void main (String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        
        boolean ehPrimo = true;
        int n;
        double raiz;
        
        System.out.print("Insira um numero: ");
        n = scan.nextInt();
        
        raiz = Math.sqrt(n);
        
        if (n < 2) 
        {
            System.out.println("O numero nao eh primo");
            return;
        }

        for (int i = 2; i <= raiz; i++) 
        {
            if (n % i == 0) 
            {
                ehPrimo = false;
                break;
            }
        }
        
        if (ehPrimo) 
        {
            System.out.println("O numero eh primo");
        } 
        else 
        {
            System.out.println("O numero nao eh primo");
        }
    }
}
