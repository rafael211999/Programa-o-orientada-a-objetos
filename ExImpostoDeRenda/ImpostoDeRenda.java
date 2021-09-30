package ExTres;

public class ImpostoDeRenda {
	protected String nome;
	protected String telefone;
	protected String email;
	protected double rendimento;
	
	public ImpostoDeRenda(String nome, double rendimento) {
		this.nome = nome;
		this.rendimento = rendimento;
	}
	
	public void calculoIr() {
		this.rendimento = this.rendimento - this.rendimento * 0.12; 	
	}
}
