package ExercicioDois;

import java.time.DayOfWeek;
import java.time.LocalDate;



public class Pedido {
	private int numero;
	private LocalDate dataPedido;
	private int quantidade;
	private double valor;
	private double total;
	public Pedido(int numero, LocalDate dataPedido, int quantidade, double valor) {
		super();
		this.numero = numero;
		this.dataPedido = dataPedido;
		this.quantidade = quantidade;
		this.valor = valor;
	}
	public int getNumero() {
		return numero;
	}
	public LocalDate getDataPedido() {
		return dataPedido;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public double getValor() {
		return valor;
	}
	public double getTotal() {
		return total;
	}
	
	public void finalizar() {
		if(this.dataPedido.getDayOfWeek().equals(DayOfWeek.SUNDAY)){
			this.total = (this.total - this.total * 0.1) * this.quantidade;
		}else {
			this.total = this.valor * this.quantidade;
		}
	}



}