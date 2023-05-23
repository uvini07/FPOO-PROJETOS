import java.util.Scanner;

	public class WhileSentinela {
		Scanner scanner = new Scanner (System.in);
		
		
	public void Sentinela() {
		
		int sentinela = 0;
		int soma = 0;		
		
			 do {
		            System.out.print("Digite um número (ou um sentinela negativo para sair): ");
		            sentinela = scanner.nextInt();

		            if (sentinela >= 0) {
		                soma += sentinela;
		            }
		        } while (sentinela >= 0);

		        System.out.println(" A soma dos números positivos é: " + soma);
		        
		    }
		}
			
			
		
	
