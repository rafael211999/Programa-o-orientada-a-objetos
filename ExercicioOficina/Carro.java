package oficina;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Carro extends Veiculo {	
	private String Categoria;

	public Carro(String modelo, LocalDate dataConserto, Proprietario proprietario, String categoria) {
		super(modelo, dataConserto, proprietario);
		this.Categoria = categoria;
	}

	public String getCategoria() {
		return Categoria;
	}

	@Override
	public Double lavarVeiculo() {
		valorCobrado += TipoServico.LAVAGEM.getValorPorServico();
		return super.valorCobrado;	
	}

	@Override
	public Double trocarOleo() {
		valorCobrado += TipoServico.OLEO.getValorPorServico();
		if (dataConserto.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
			valorCobrado = valorCobrado - 50;
			return super.valorCobrado ;}
		else {
			return super.valorCobrado ;
		}	
	}

  @Override
	public Double revisao() {
		valorCobrado += TipoServico.REVISAO.getValorPorServico();
		if (dataConserto.getMonth().equals(Month.AUGUST)) {
			valorCobrado -= valorCobrado * 0.1;
			return super.valorCobrado ;}
		else {
			return super.valorCobrado ;
		}
  }
}