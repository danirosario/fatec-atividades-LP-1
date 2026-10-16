//daniela de toledo rosario

import java.util.Scanner;

public class CalculadoraSimples 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Scanner scanStr = new Scanner(System.in);

        double num1, num2;
        String operacaoStr;
        char operacao;
        double resultado = 0;

        System.out.print("Digite o primeiro valor: ");
        num1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        num2 = scanner.nextDouble();

        System.out.print("Digite a operação desejada (+, -, *, /): ");
        operacaoStr = scanStr.nextLine();
        operacao = operacaoStr.charAt(0);

        switch (operacao) 
        {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) 
                {
                    resultado = num1 / num2;
                } 
                else 
                {
                    System.out.println("Erro: Divisão por zero não permitida!");
                }
                break;
            default:
                System.out.println("Erro: Operação inválida!");
                break;
        }
        System.out.printf("Resultado da operacao: %.2f %c %.2f = %.2f", num1, operacao, num2, resultado);
    }
}
