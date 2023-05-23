import java.util.Scanner;

public class Valor {
    public static void main(String[] args) {
        int[] valores = new int[10];
        int[] valores2 = new int[10];
        Scanner objScanner = new Scanner(System.in);
        
        System.out.println("Digte 10 valores: ");
        for (int indice = 0; indice < valores.length; indice++) {
            valores[indice] = objScanner.nextInt();
        }
    
        for (int indice = 0; indice < valores.length; indice++) {
            valores2[indice] = valores[indice] * 3;
        }

        
        System.out.println("Valores 1: ");
        for (int indice = 0; indice < valores.length; indice++) {
            System.out.println(valores[indice]);
        }

        System.out.println("Valores 2: ");
        for (int indice = 0; indice < valores2.length; indice++) {
            System.out.println(valores2[indice]);
        }
    }
}