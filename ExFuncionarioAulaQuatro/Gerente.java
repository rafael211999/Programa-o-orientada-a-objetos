package ExFuncionarioAulaQuatro;

public class Gerente extends Funcionario {
	private String nivel;

	public Gerente(String nome, double salario) {
		super(nome, salario);
	}
	
	@Override
	public void calcParticipacao() {
		super.calcParticipacao();
		this.salario += 200;
	}

}
