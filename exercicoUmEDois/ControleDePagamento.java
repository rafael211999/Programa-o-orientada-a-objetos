	package exercicoUmEDois;

public class ControleDePagamento {
	private double totalPago;

	public double getTotalPago(){
		return totalPago;
	}
	
	public void calcValorTotal(Plano plano) {
		this.totalPago +=  plano.calcularPagamento();
	}
}
