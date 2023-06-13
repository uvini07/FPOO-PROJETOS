package pacote;
import java.util.Scanner;

public class Saude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o plano de saúde: ");
        String plano = scanner.nextLine().toLowerCase(); 
        
        double mensalidade = calcularMensalidade(plano);
        
        if (mensalidade != -1) {
            System.out.println("Valor da mensalidade: R$ " + mensalidade);
        } else {
            System.out.println("Plano inválido.");
        }
    }
    
    public static double calcularMensalidade(String plano) { 
        double valorMensalidade = -1;
        
 
        switch (plano) {
            case "basico":
                valorMensalidade = 150.00;
                break;
            case "bronze":
                valorMensalidade = 220.00;
                break;
            case "prata":
                valorMensalidade = 310.00;
                break;
            case "uro":
                valorMensalidade = 450.00;
                break;
        }
        
        return valorMensalidade;
    }
}