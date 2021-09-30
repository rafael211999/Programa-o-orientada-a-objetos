package ExFuncionarioAulaQuatro;

public class Teste {

	public static void main(String[] args) {
		Gerente gerente = new Gerente("Rafael Alves", 10500.00);
		Assistente assistente = new Assistente("Pedro Carvalo", 1500.00, 500.00);

		gerente.calcularBonificacao(gerente);	
		assistente.calcularBonificacao(assistente);	
		
	}
}
