package aulas;

public class Medico {
	String crm;
	String nome;
	double salario;
	double valorConsulta;
	static int totalMedico = 0;
	
	public Medico() {
		totalMedico++;
	};

	public Medico(String crm, String nome, double salario, double valorConsulta  ) {
		super();
		this.crm = crm;
		this.nome = nome;
		this.salario = salario ;
		this.valorConsulta = valorConsulta;
		totalMedico++;
	}

	public void pagamentoDinheiro() {
		this.salario = this.valorConsulta;
	}
	
	public void pagamentoPlano() {
		this.salario = this.valorConsulta * 0.7;
	}
	
	
}
