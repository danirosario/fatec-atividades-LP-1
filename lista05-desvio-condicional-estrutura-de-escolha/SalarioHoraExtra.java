//daniela de toledo rosario

import java.util.Scanner;

public class SalarioHoraExtra 
{ 
    public static void main(String[] args) 
	{
        Scanner scan = new Scanner(System.in);
        
        int horasTrabalhadas    = 0;
		int horasNormaisMensais = 40 * 4;
        double salarioHora      = 0.0;
        double salarioTotal     = 0.0;
        
        System.out.print("Entre com a quantidade de horas trabalhadas: ");
        horasTrabalhadas = scan.nextInt();
        
        System.out.print("Entre com o valor do salario hora: ");
        salarioHora = scan.nextDouble();
        
        if (horasTrabalhadas > horasNormaisMensais)
		{
            
            int horasExtras = horasTrabalhadas - horasNormaisMensais;

            double valorHoraExtra = salarioHora * 0.5;
            
            salarioTotal = (horasNormaisMensais * salarioHora) + (horasExtras * valorHoraExtra);
        } 
		else 	
		{
            salarioTotal = horasTrabalhadas * salarioHora;
        }
        
        System.out.printf("Salario total: R$ %.2f", salarioTotal);
        scan.close();
    }
}