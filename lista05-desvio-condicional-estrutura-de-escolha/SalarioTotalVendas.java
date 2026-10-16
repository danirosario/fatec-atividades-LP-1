//daniela de toledo rosario

import java.util.Scanner;

public class SalarioTotalVendas 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        double salarioFixo = 0.0;
        double vendasEfetuadas = 0.0;
        double comissao3PorCento = 0.03;
        double comissao5PorCento = 0.05;
        double salarioTotal = 0.0;

        System.out.println("Insira o valor do salario fixo: ");
        salarioFixo = scan.nextDouble();

        System.out.println("Insira o valor das vendas efetuadas: ");
        vendasEfetuadas = scan.nextDouble();

        if (vendasEfetuadas > 1500.0) 
        {
            salarioTotal = salarioFixo + (vendasEfetuadas * comissao5PorCento);
        } 
        else 
        {
            salarioTotal = salarioFixo + (vendasEfetuadas * comissao3PorCento);
        }
        
        System.out.println("Salario total = " + salarioTotal);
        
        scan.close();
    }
}