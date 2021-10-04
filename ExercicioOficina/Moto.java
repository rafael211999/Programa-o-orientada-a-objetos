package oficina;
import java.time.LocalDate;

public class Moto extends Veiculo {
	private Integer cilindradas;
	
	public Moto(String modelo, LocalDate dataConserto, Proprietario proprietario) {
		super(modelo, dataConserto, proprietario);
	}

	@Override
	public Double lavarVeiculo() {
		valorCobrado = TipoServico.LAVAGEM.getValorPorServico();
		return valorCobrado;
	}

	@Override
	public Double trocarOleo() {
		valorCobrado = TipoServico.OLEO.getValorPorServico();
		return valorCobrado;
	}

	@Override
	public Double revisao() {
		valorCobrado = TipoServico.REVISAO.getValorPorServico();
		return valorCobrado;
	}

	public Integer getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(Integer cilindradas) {
		this.cilindradas = cilindradas;
	}
}