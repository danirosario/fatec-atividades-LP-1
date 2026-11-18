//daniela de toledo rosario

import java.util.Scanner;

public class Sequencias_Exercicio63
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

            int aux = a + b;
            a = b;
            b = aux;

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

            System.out.print(fibonacci + "/" + primo);

            soma += (double) fibonacci / primo;

            if (i < n)
            {
                System.out.print(" + ");
            }

            primo++;
        }

        System.out.printf("\n\nSoma dos termos: %.2f\n", soma);

        scan.close();
    }
}


