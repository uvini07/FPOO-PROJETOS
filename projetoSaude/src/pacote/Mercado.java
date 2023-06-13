package pacote;
import java.util.Scanner;

public class Mercado {
    public static void main(String[] args) {
        calcularPrecoTotal();
    }

    public static void calcularPrecoTotal() {
        Scanner scanner = new Scanner(System.in);
        int op��o;
        String codigo;
        int quantidade;
        double total = 0.0;

        while (true) {
            exibirMenu();
            op��o = lerop��o(scanner);

            switch (op��o) {
                case 1:
                    codigo = lerCodigoProduto(scanner);
                    quantidade = lerQuantidade(scanner);
                    double pre�o = calcularpre�o(codigo);
                    total += calcularTotal(pre�o, quantidade);
                    break;
                case 2:
                    exibirTotal(total);
                    break;
                case 3:
                    System.out.println("Valor Total: " + total);
                    System.out.println("Saindo...");
                    return;
                default:
                    exibirMensagemDeErro();
                    break;
            }
        }
    }

    public static void exibirMenu() {
        System.out.println("========== MENU ==========");
        System.out.println("1. Digite o c�digo de um produto");
        System.out.println("2. Exibir total ");
        System.out.println("3. Sair");
        System.out.println("==========================");
    }

    public static int lerop��o(Scanner scanner) {
        System.out.print("Digite a op��o desejada: ");
        return scanner.nextInt();
    }

    public static String lerCodigoProduto(Scanner scanner) {
        System.out.print("Digite o c�digo do produto: ");
        return scanner.next().toLowerCase();
    }

    public static int lerQuantidade(Scanner scanner) {
        System.out.print("Digite a quantidade comprada: ");
        return scanner.nextInt();
    }

    public static double calcularpre�o(String codigo) {
        switch (codigo) {
            case "a001":
                return 7.50;
            case "a002":
                return 9.90;
            case "a003":
                return 14.00;
            case "a004":
                return 19.99;
            default:
                return 0.00;
        }
    }

    public static double calcularTotal(double pre�o, int quantidade) {
        return pre�o * quantidade;
    }

    public static void exibirTotal(double total) {
        System.out.println("Total : " + total);
    }

    public static void exibirMensagemDeErro() {
        System.out.println("C�digo de produto inv�lido!");
    }
}
