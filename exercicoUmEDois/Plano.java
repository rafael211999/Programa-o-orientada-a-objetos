package exercicoUmEDois;

public class Plano {
	protected String empresa;
	protected double valorPago = 80;
	protected double valorIss = 5;
	
	public Plano(String empresa) {
		super();
		this.empresa = empresa;
	}
	
	@Override
	public String toString() {
		return "Plano:" + empresa + " ValorPago:R$" + String.format("%.2f ", valorPago);
	}
	
	public double calcularPagamento() {
		return valorPago = valorPago - valorPago * valorIss / 100;
	}
}
