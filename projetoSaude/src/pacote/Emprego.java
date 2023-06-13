package pacote;
import java.util.Scanner;

public class Emprego {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("C�digo - Cargo");
        System.out.println("  1 - Escritur�rio");
        System.out.println("  2 - Secret�rio");
        System.out.println("  3 - Caixa");
        System.out.println("  4 - Gerente");
        System.out.println("  5 - Diretor");

       
        System.out.print("Digite o c�digo do cargo: ");
        int codigoCargo = scanner.nextInt();

       
        System.out.print("Digite o sal�rio atual: ");
        double salarioAtual = scanner.nextDouble();

        
        double percentualAumento = 0.0;
        String cargo = "";

        switch (codigoCargo) {
            case 1:
 
            	percentualAumento = 0.5;
                cargo = "Escritur�rio";
                break;
            case 2:
                percentualAumento = 0.35;
                cargo = "Secret�rio";
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
                System.out.println("C�digo de cargo inv�lido!");
                return;
        }

        double aumento = salarioAtual * percentualAumento;
        double novoSalario = salarioAtual + aumento;

       
        System.out.println("Cargo: " + cargo);
        System.out.println("Valor do aumento: " + aumento);
        System.out.println("Novo sal�rio: " + novoSalario);
    }
}
