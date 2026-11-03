//daniela de toledo rosario

public class Fibonacci_Exercicio53 
{    
    public static void main(String[] args) 
    {
        long a = 0;
        long b = 1;
        long c = 0;
        
        System.out.println("Numeros da sequencia de Fibonacci na faixa de 1 a 250:");
        
        while (a <= 250) 
        {
            if (a >= 1) 
            {
                System.out.println(a);
            }
            
            c = a + b;
            a = b;
            b = c;
        }
    }
}
