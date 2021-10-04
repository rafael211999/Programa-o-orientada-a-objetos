package exercicioTres;

public class Contato {
	private String nome;
	private Endereco endereco;
	private Telefone[] telefones;
	
	public Contato(String nome, Endereco endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public Telefone[] getTelefones() {
		return telefones;
	}
	public void setTelefones(Telefone[] telefones) {
		this.telefones = telefones;
	}
	public String getNome() {
		return nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}

	public void mostrarTelefone() {
		for (int i = 0; i < telefones.length; i++) {
			System.out.println("Telefone:" + telefones[i].getNumero());
		}
	}
			
}