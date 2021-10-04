package exercicioMercado;

public class Eletrodomestico extends Produtos {
	private String voltagem;

	
	public Eletrodomestico(String nome, double valor, String voltagem) {
		super(nome, valor);
		this.voltagem = voltagem;
	}

	public String getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(String voltagem) {
		this.voltagem = voltagem;
	}

	@Override
	public String toString() {
		return String.format("Nome:%s\nValor Total:R$%.2f\nVoltagem:%s\n", this.getNome() , this.getValor(), this.voltagem);
	}
}
