package ProjetoFinalPOO;

public class Filme extends Programa {
	private int duracao;

	public Filme(String nome, Categoria categoria, int duracao) {
		super(nome, categoria);
		this.duracao = duracao;
	}

	public int getDuracao() {
		return this.duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
}
