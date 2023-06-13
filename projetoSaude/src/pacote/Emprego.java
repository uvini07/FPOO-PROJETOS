package pacote;
import java.util.Scanner;

public class Emprego {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Código - Cargo");
        System.out.println("  1 - Escriturário");
        System.out.println("  2 - Secretário");
        System.out.println("  3 - Caixa");
        System.out.println("  4 - Gerente");
        System.out.println("  5 - Diretor");

       
        System.out.print("Digite o código do cargo: ");
        int codigoCargo = scanner.nextInt();

       
        System.out.print("Digite o salário atual: ");
        double salarioAtual = scanner.nextDouble();

        
        double percentualAumento = 0.0;
        String cargo = "";

        switch (codigoCargo) {
            case 1:
 
            	percentualAumento = 0.5;
                cargo = "Escriturário";
                break;
            case 2:
                percentualAumento = 0.35;
                cargo = "Secretário";
                break;
            case 3:
                percentualAumento = 0.2;
                cargo = "Caixa";
                break;
            case 4:
                percentualAumento = 0.1;
                cargo = "Gerente";
                break;
            case 5:
                percentualAumento = 0.0;
                cargo = "Diretor";
                break;
            default:
                System.out.println("Código de cargo inválido!");
                return;
        }

        double aumento = salarioAtual * percentualAumento;
        double novoSalario = salarioAtual + aumento;

       
        System.out.println("Cargo: " + cargo);
        System.out.println("Valor do aumento: " + aumento);
        System.out.println("Novo salário: " + novoSalario);
    }
}
