//daniela de toledo rosario

import java.util.Scanner;

public class Fatorial_Exercicio45 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Insira a quantidade de termos do fatorial: ");
        int numeroTermos = scan.nextInt();
        
        int[] resultado = new int[numeroTermos];
        int fatorial = 1;
        
        for (int i = 0; i < numeroTermos; i++) 
        {
            fatorial = fatorial * (i + 1);
            resultado[i] = fatorial;
        }
        
        for (int i = numeroTermos - 1; i >= 0; i--) 
        {
            System.out.println((i + 1) + "! = " + resultado[i]);
        }
    }
}
