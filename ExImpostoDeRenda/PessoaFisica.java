package ExTres;

public class PessoaFisica extends ImpostoDeRenda{
	private String cpf;
	private String rg;

	public PessoaFisica(String nome, double rendimento, String cpf, String rg) {
		super(nome, rendimento);
		this.cpf = cpf;
		this.rg = rg;
	}
	
	@Override
	public String toString() {
		return String.format("Pessoa fisica - nome: %s, Rendimentos: %.2f, Cpf: %s, RG: %s  ", 
				this.nome, this.rendimento, this.cpf, this.rg);
	}
}
