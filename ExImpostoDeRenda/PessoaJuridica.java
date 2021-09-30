package ExTres;

public class PessoaJuridica extends ImpostoDeRenda{
	
	private String cnpj;
	private String inscricaoEstadual;

	public PessoaJuridica(String nome, double rendimento, String cnpj, String inscricaoEstadual) {
		super(nome, rendimento);
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
	}
	
	@Override
	public void calculoIr() {
		this.rendimento = this.rendimento - this.rendimento * 0.15; 	
	}
	
	@Override
	public String toString() {
		return String.format("Pessoa juridica - nome: %s, Rendimentos: %.2f, Cnpj: %s, Inscrição estadual: %s  ", 
				this.nome, this.rendimento, this.cnpj, this.inscricaoEstadual);
	}
	
	

}
