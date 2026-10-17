//daniela de toledo rosario
//exercicio 23

import java.util.Scanner;

public class PesquisaPrefeitura 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        
        int quantidadePessoas = 0;
        int totalFilhos = 0;
        double mediaFilhos = 0.0;
        double salario;
        double somaSalarios = 0.0;
        double maiorSalario = 0.0;
        double mediaSalario = 0.0;
        int contadorSalarioBaixo = 0;
        double percentual = 0.0;

        System.out.print("Insira o salario: ");
        salario = scan.nextDouble();

        while (salario >= 0) 
        {
            System.out.print("Insira a quantidade de filhos: ");
            int numFilhos = scan.nextInt();
            
            quantidadePessoas++;
            somaSalarios += salario;
            totalFilhos += numFilhos;
            
            if (salario > maiorSalario) 
            {
                maiorSalario = salario;
            }
            
            if (salario <= 150.0) 
            {
                contadorSalarioBaixo++;
            }
            
            System.out.print("Insira o salario: ");
            salario = scan.nextDouble();
        }
        
        mediaSalario = somaSalarios / quantidadePessoas;
        mediaFilhos = (double) totalFilhos / quantidadePessoas;
        percentual = ((double) contadorSalarioBaixo / quantidadePessoas) * 100;
            
        System.out.printf("Media de salario: R$ %.2f\n", mediaSalario);
        System.out.printf("Media do numero de filhos: %.2f\n", mediaFilhos);
        System.out.printf("Maior salario registrado: R$ %.2f\n", maiorSalario);
        System.out.printf("Percentual com salario até R$ 150,00: %.2f%%\n", percentual);
	}
}
