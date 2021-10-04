package oficina;

public enum TipoServico {
	OLEO (40.0), 
	LAVAGEM (150.0), 
	REVISAO (800.0);

	private Double valorPorServico;
	
	private TipoServico(double valorPorServico) {
		this.valorPorServico = valorPorServico;	
	}
	
	public double getValorPorServico() {
		return valorPorServico;
	}

}
