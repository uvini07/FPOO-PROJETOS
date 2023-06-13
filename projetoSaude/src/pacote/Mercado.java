package pacote;
import java.util.Scanner;

public class Mercado {
    public static void main(String[] args) {
        calcularPrecoTotal();
    }

    public static void calcularPrecoTotal() {
        Scanner scanner = new Scanner(System.in);
        int opção;
        String codigo;
        int quantidade;
        double total = 0.0;

        while (true) {
            exibirMenu();
            opção = leropção(scanner);

            switch (opção) {
                case 1:
                    codigo = lerCodigoProduto(scanner);
                    quantidade = lerQuantidade(scanner);
                    double preço = calcularpreço(codigo);
                    total += calcularTotal(preço, quantidade);
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
        System.out.println("1. Digite o código de um produto");
        System.out.println("2. Exibir total ");
        System.out.println("3. Sair");
        System.out.println("==========================");
    }

    public static int leropção(Scanner scanner) {
        System.out.print("Digite a opção desejada: ");
        return scanner.nextInt();
    }

    public static String lerCodigoProduto(Scanner scanner) {
        System.out.print("Digite o código do produto: ");
        return scanner.next().toLowerCase();
    }

    public static int lerQuantidade(Scanner scanner) {
        System.out.print("Digite a quantidade comprada: ");
        return scanner.nextInt();
    }

    public static double calcularpreço(String codigo) {
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

    public static double calcularTotal(double preço, int quantidade) {
        return preço * quantidade;
    }

    public static void exibirTotal(double total) {
        System.out.println("Total : " + total);
    }

    public static void exibirMensagemDeErro() {
        System.out.println("Código de produto inválido!");
    }
}
