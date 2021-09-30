package ExFuncionarioAulaQuatro;

public class Funcionario {
	protected String nome;
	protected String cpf;
	protected double salario;
	protected String turno;
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public String toString() {
		return String.format("Funcionario - nome: %s, Salario: %.2f ", this.nome, this.salario);
	}
	
	public void calcParticipacao() {
		this.salario += this.salario * 0.01;
	}

	public void calcularBonificacao(Funcionario funcionario) {
		funcionario.calcParticipacao();
		System.out.println(funcionario);
	}
	
}
