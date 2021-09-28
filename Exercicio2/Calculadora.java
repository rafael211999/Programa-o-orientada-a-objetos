package Exercicio2;

import java.util.Scanner;

public class Calculadora {
	double n1, n2;
	int opcao;
	double soma, subtracao, multiplicacao, divisao;
	
	Scanner ler = new Scanner(System.in);
	
	public void Calcular(){
		System.out.println("Qual o valor: ");
		n1 = ler.nextDouble();
		System.out.println("Qual o valor: ");
		n2 = ler.nextDouble();
		
		System.out.println("Selecione a operação:");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		System.out.println("5 - Sair");
		
		opcao = ler.nextInt();
		
		switch(opcao){
			case 1:
				soma = n1 + n2;
				System.out.println("O resultado é:" + soma);
				break; 			
		
			case 2:
					subtracao = n1 - n2;
					System.out.println("O resultado é:" + subtracao);
					break;
					
			case 3:
				multiplicacao = n1 * n2;
				System.out.println("O resultado é:" + multiplicacao);
				break;
				
			case 4:
				divisao = n1 / n2;
				System.out.println("O resultado é:" + divisao);
				break;
				
			 default:
				 System.out.println("Tchau");
		}
	}	 
}	