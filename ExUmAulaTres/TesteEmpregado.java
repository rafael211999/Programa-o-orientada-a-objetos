package ExeercicioUm;

public class TesteEmpregado {

	public static void main(String[] args) {
		
		Empregado empregado1 = new Empregado("Gilnei", "Das Candangas", 250000.00);
		Empregado empregado2 = new Empregado("Rafael", "Da Quebrada", 200000.00);
		
		double salario1 = empregado1.calculaImpostoRenda(empregado1.getSalario());
		empregado1.setSalario(salario1);
		
		double salario2 = empregado2.calculaImpostoRenda(empregado2.getSalario());
		empregado2.setSalario(salario2);
		
		empregado1.imprimirEmpregado();
		empregado2.imprimirEmpregado();
		
	}
}
