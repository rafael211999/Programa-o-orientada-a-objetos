package exercicioMercado;

public class BebidaAlcoolica extends Produtos {
	private String TeorAlcoolico;

	public BebidaAlcoolica(String nome, double valor, String teorAlcoolico) {
		super(nome, valor);
		TeorAlcoolico = teorAlcoolico;
	}

	public String getTeorAlcoolico() {
		return TeorAlcoolico;
	}

	public void setTeorAlcoolico(String teorAlcoolico) {
		TeorAlcoolico = teorAlcoolico;
	}
	
	@Override
	public String toString() {
		return String.format("Nome:%s\nValor Total:R$%.2f\nTeor Alcoólico:%s\n", this.getNome() , this.getValor(), this.TeorAlcoolico);
	}

}
