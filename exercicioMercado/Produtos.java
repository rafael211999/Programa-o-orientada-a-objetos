package exercicioMercado;

public abstract class Produtos {
	private String nome;
	private double valor;
	public Produtos(String nome, double valor) {
		super();
		this.nome = nome;
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public double vender(int quantidadeDeItens) {
		this.valor = quantidadeDeItens * valor;
		return valor;	
	}
	
	@Override
	public String toString() {
		return String.format("Nome:%s, Valor Total: %.2f", this.nome , this.valor);
	}
}
