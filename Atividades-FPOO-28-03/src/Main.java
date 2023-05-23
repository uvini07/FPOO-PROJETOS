import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		
		Scanner  scanner = new Scanner(System.in);
		Enunciado1 objEnunciado1 = new Enunciado1();
		Enunciado2 objEnunciado2 = new Enunciado2();
		Enunciado3 objEnunciado3 = new Enunciado3();
		Enunciado4 objEnunciado4 = new Enunciado4();
		Enunciado5 objEnunciado5 = new Enunciado5();
		int n1, n2, n3,num,num1,num2,num3;
		double nota1, nota2, nota3, nota4, nota5,media1;
		
		
//	//enunciado-1
		
	
		System.out.println("INFORME UM NUMERO: ");
		n1= scanner.nextInt();

		System.out.println("INFORME O SEGUNDO NUMERO: ");
		n2= scanner.nextInt();
	
		objEnunciado1.exibirMaior(n1,n2);
		
		
		
//		//enunciado-2
		System.out.println("Vamos Para o Enunciado-2");
		System.out.println("INFORME UM NUMERO: ");
		n1= scanner.nextInt();

		System.out.println("INFORME O SEGUNDO NUMERO: ");
		n2= scanner.nextInt();
		
		System.out.println("INFORME UM NUMERO: ");
		n3= scanner.nextInt();
	
		objEnunciado2.exibirMaior(n1,n2,n3);
	
			
		
		//enunciado-3
		System.out.println("Vamos Para o Enunciado-3");
		
		System.out.println("NOTA 1");
		objEnunciado3.setN1(scanner.nextDouble());
		
		System.out.println("NOTA 2");
		objEnunciado3.setN2(scanner.nextDouble());
		
		System.out.println("NOTA 3");
		objEnunciado3.setN3(scanner.nextDouble());
		
		System.out.println("NOTA 4");
		objEnunciado3.setN4(scanner.nextDouble());
	
		if (objEnunciado3.Media2() >= 7) {
			objEnunciado3.CalcularMedia1();
		}else {
			System.out.println("NOTA 5");
			objEnunciado3.setN5(scanner.nextDouble());
	
		objEnunciado3.CalcularMedia2();
	}
	
	//enunciado4
	
		System.out.println("Vamos Para o Enunciado-4");
	
		System.out.print("Digite um número inteiro positivo: ");
		num= scanner.nextInt();

	       if (num > 0) {
	           if (objEnunciado4.ehPar(num)) {
	               System.out.println(num + " é par.");
	           } else {
	               System.out.println(num + " é ímpar.");
	           }
	       } else {
           System.out.println("O número deve ser positivo.");
		
		
		
		
//enunciado5
        System.out.println("Vamos Para o Enunciado-5");
            
		System.out.print("Digite o primeiro número: ");
		int num11 = scanner.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int num21 = scanner.nextInt();
		
		System.out.print("Digite o operador (+, -, * ou /): ");
		String operadorStr = scanner.next();

		int resultado = objEnunciado5.Operação(num11, num21, operadorStr);
		
		System.out.println(num11 + " " + operadorStr + " " + num21 + " = " + resultado);
		
	    }	
		 
		}
	}