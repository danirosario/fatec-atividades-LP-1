//daniela de toledo rosario

import java.util.Scanner;

public class Sequencias_Exercicio64
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n;
        double soma = 0;

        System.out.print("Digite a quantidade de termos: ");
        n = scan.nextInt();

        System.out.println("\nSequencia:");

        int a = 1, b = 1;
        int primo = 2;

        for (int i = 1; i <= n; i++)
        {
            int fibonacci = a;

            // Proximo termo de Fibonacci
            int aux = a + b;
            a = b;
            b = aux;

            // Encontrar o próximo número primo
            boolean ehPrimo = false;

            while (!ehPrimo)
            {
                ehPrimo = true;

                for (int j = 2; j < primo; j++)
                {
                    if (primo % j == 0)
                    {
                        ehPrimo = false;
                        break;
                    }
                }

                if (!ehPrimo)
                {
                    primo++;
                }
            }

            if (i > 1)
            {
                if (i % 2 == 0)
                {
                    System.out.print(" - ");
                    soma -= (double) fibonacci / primo;
                }
                else
                {
                    System.out.print(" + ");
                    soma += (double) fibonacci / primo;
                }
            }
            else
            {
                soma += (double) fibonacci / primo;
            }

            System.out.print(fibonacci + "/" + primo);

            primo++;
        }

        System.out.printf("\n\nSoma dos termos: %.2f\n", soma);

        scan.close();
    }
}
