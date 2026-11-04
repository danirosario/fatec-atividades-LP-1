//daniela de toledo rosario

import java.util.Scanner;

public class NumerosPerfeitos_Exercicio57 
{    
    public static void main (String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Insira a quantidade de termos: ");
        int qntTermos = scan.nextInt();
        
        int contador = 0; 
        int n = 1;           

        while (contador < qntTermos) 
        {
            int soma = 0;

            for (int i = 1; i < n; i++) 
            {
                if (n % i == 0) {
                    soma += i;
                }
            }

            if (soma == n) 
            {
                System.out.println(n);
                contador++;
            }
            
            n++;
        }
    }
}
