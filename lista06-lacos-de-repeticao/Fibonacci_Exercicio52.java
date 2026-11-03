//daniela de toledo rosario

import java.util.Scanner;

public class Fibonacci_Exercicio52 
{    
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Insira um numero inteiro: ");
        int n = scan.nextInt();

        long verificaFibonacci  = 5 * n * n + 4;
        long verificaFibonacci2 = 5 * n * n - 4;
        
        long raiz1 =  (long) Math.sqrt(verificaFibonacci);
        long raiz2 =  (long) Math.sqrt(verificaFibonacci2);
        
        long quadradoPerfeito1 = raiz1 * raiz1;
        long quadradoPerfeito2 = raiz2 * raiz2;
        
        boolean ehFibonacci = (quadradoPerfeito1 == verificaFibonacci) || (quadradoPerfeito2 == verificaFibonacci2);
        
        if (ehFibonacci) 
        {
            System.out.println("O numero pertence a sequencia Fibonacci");
        } 
        else 
        {
            System.out.println("O numero NAO pertence a sequencia Fibonacci");
        }
    }
}

/*
 * # n é Fibonacci se o resultado de 5*n*n + 4 ou 5*n*n - 4 ou ambos
 * # forem quadrados perfeitos.
*/
