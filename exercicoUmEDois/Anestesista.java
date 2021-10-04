package exercicoUmEDois;

public class Anestesista extends Medico {
	private String tipoAnestesia;

	public Anestesista(String empresa, String nome, int crm, String tipoAnestesia) {
		super(empresa, nome, crm);
		this.tipoAnestesia = tipoAnestesia;
	}

	public String getTipoAnestesita() {
		return tipoAnestesia;
	}

	public void setTipoAnestesita(String tipoAnestesita) {
		this.tipoAnestesia = tipoAnestesita;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Tipo Anestesia" + tipoAnestesia;
	}
	

	@Override
	public double calcularPagamento() {
		return valorPago = super.calcularPagamento() + 1000;
	}

}
