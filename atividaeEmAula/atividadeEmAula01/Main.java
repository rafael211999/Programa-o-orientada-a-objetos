package atividadeEmAula01;

import java.util.Scanner;

public class Main {

	private int lerNumero;

	public static void main(String[] args) {
		
		Main m = new Main();
		System.out.println("Digite um numero inteiro");
		try {
			int num = m.lerNumero;
			System.out.println("Você digitou " + num);
		}catch (Exception e) {
			System.out.println("Falha ao ler seu numero");
		}
		
	}
	

	public int lerNumero() throws Exception{
	Scanner in = new Scanner(System.in);
	int num = in.nextInt();
	in.close();
	return num;
	}
}
