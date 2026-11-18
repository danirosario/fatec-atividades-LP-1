/*CODIGO PREGUIÇOSO DE IA*/

import java.util.Scanner;

public class FibonacciInverso 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        
        int qntTermos = 0;
        
        while (true) 
        {
            System.out.print("\nInsira a quantidade de termos: ");
            qntTermos = scan.nextInt();
            
            if (qntTermos == 0) 
            {
                System.out.println("\nFim do programa!");
                break;
            }
            if (qntTermos < 0) 
            {
                System.out.println("Quantidade invalida!\n");
                continue;
            }

            for (int i = qntTermos; i > 0; i--) 
            {
                int a = 0;                       
                int b = 1;
                int c = 0;
  
                if (i == 2) 
                {
                    c = 1;
                } 
                else
                {
                    for (int j = 3; j <= i; j++)
                    {
                        c = a + b; 
                        a = b;
                        b = c;
                    }
                }
                
                System.out.print(c + " ");
            }
            System.out.println();
        }
        
        scan.close();
    }
}
