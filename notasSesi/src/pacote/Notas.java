package pacote;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Notas {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("###----- BEM VINDO AO PROGAMA MÉDIA ----###");
		
		
		Double nota1,nota2,nota3,nota4,media = null;
		
	nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira nota"));
	nota2= Double.parseDouble(JOptionPane.showInputDialog(media + "Informe a segunda nota"));
	nota3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a terceira nota"));
	nota4 = Double.parseDouble(JOptionPane.showInputDialog("Informe a quarta nota"));
//		System.out.println("INFORME NOTA 1");
//		nota1 = scanner.nextDouble();
//		1
//		System.out.println("INFORME NOTA 2");
//		nota2 = scanner.nextDouble();
//		
//		System.out.println("INFORME NOTA 3");
//		nota3 = scanner.nextDouble();
//		
//		System.out.println("INFORME NOTA 4");
//		nota4 = scanner.nextDouble();
//		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if(media > 7){
			System.out.println(media + " Aprovado");
			
		}else if(media >= 5){
			System.out.println(media + " Recuperação");
		}
		else {
			System.out.println(media + " Reprovado");
		}
		
	}

}
