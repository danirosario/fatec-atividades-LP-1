import java.util.Scanner;

public class IdadeHomemMulher 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Insira a idade da primeira mulher: ");
        int idadeMulher1 = scan.nextInt();
        
        System.out.print("Insira a idade da segunda mulher: ");
        int idadeMulher2 = scan.nextInt();
        
        System.out.print("Insira a idade do primeiro homem: ");
        int idadeHomem1 = scan.nextInt();
        
        System.out.print("Insira a idade do segundo homem: ");
        int idadeHomem2 = scan.nextInt();

        int mulherMaisVelha = Math.max(idadeMulher1, idadeMulher2);
        int mulherMaisNova  = Math.min(idadeMulher1, idadeMulher2);
        
        int homemMaisVelho  = Math.max(idadeHomem1, idadeHomem2);
        int homemMaisNovo   = Math.min(idadeHomem1, idadeHomem2);

        int somaDasIdades    = homemMaisVelho + mulherMaisNova;
        int produtoDasIdades = homemMaisNovo * mulherMaisVelha;

        System.out.println("Soma: " + somaDasIdades);
        System.out.println("Produto: " + produtoDasIdades);

        if (idadeMulher1 == idadeMulher2) 
        {
            System.out.println("mulheres de idades iguais");
        }
        if (idadeHomem1 == idadeHomem2) 
        {
            System.out.println("homens de idades iguais");
        }
    }
}
