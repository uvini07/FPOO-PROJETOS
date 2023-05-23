import java.util.Scanner;

public class Media {
    String[] alunos;

    Scanner objScanner = new Scanner(System.in);
    																									
    void listarAlunos() {
        System.out.print("Digite o número de alunos: ");
        int tamanho = objScanner.nextInt();
        alunos = new String[tamanho];

        for (int indice = 0; indice < alunos.length; indice++) {
            System.out.println("Digite o nome do aluno " + (indice + 1) + ": ");
            alunos[indice] = objScanner.next();
        }

        for (int indice = 0; indice < alunos.length; indice++) {
            System.out.println((indice + 1) + "º NOME ALUNO(A): " + alunos[indice]);
        }

        System.out.println("TOTAL DE ALUNOS: " + alunos.length);
    }
}