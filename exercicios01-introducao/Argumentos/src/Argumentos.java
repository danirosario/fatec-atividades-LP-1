public class Argumentos 
{
        public static void main(String[] args) 
    {
        if (args == null || args.length == 0)
        {
            System.out.println("Nenhum argumento de linha de comando foi fornecido");
        } 
        else
        {
            System.out.println("O primeiro argumento e: " + args[0]);
            System.out.println(" O segundo argumento e: " + args[1]);
        }
    }
}
