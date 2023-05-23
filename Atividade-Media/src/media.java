
import java.util.Scanner;

public class media {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("###----- BEM VINDO AO PROGAMA MÉDIA ----###");
		
		String nomeAluno, disciplina;
		double nota1,nota2,nota3,nota4,media;
		
		System.out.println("INFORME O NOME DO ALUNO:");
		nomeAluno = scanner.next();
		
		System.out.println("INFORME DA DISCIPLINA");
		disciplina = scanner.next();
		
		System.out.println("INFORME NOTA 1");
		nota1 = scanner.nextDouble();
		
		System.out.println("INFORME NOTA 2");
		nota2 = scanner.nextDouble();
		
		System.out.println("INFORME NOTA 3");
		nota3 = scanner.nextDouble();
		
		System.out.println("INFORME NOTA 4");
		nota4 = scanner.nextDouble();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("DISCIPLINA:" + disciplina);
			System.out.println("NOME:" + nomeAluno);
				System.out.println("MÉDIA: " + media);
					System.out.println("<3>----OBRIGADO POR USAR NOSSO PROGAMA DE MÉDIA----<3>");
		
	}

}
