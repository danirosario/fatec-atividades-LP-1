//daniela de toledo rosario

import java.util.Random;

public class ExibeNumeroAleatorio 
{
    public static void main(String[] args)
    {
        Random random = new Random();
        
        double numeroAleatorio = random.nextDouble(0, 100);

        System.out.println(numeroAleatorio);
    }
}
