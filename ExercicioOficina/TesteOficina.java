package oficina;
import java.time.LocalDate;

public class TesteOficina {
	public static void main(String[] args) {
		Proprietario nome = new Proprietario("Rafael Alves");
		Carro carro = new Carro ("Ret", LocalDate.of(2021, 12, 10),nome, "Carro");
		
		carro.revisao();
		carro.trocarOleo();
		
		System.out.println("Proprietário: "+ carro.proprietario);
		System.out.println("Modelo: " + carro.modelo);
		System.out.println("Data do Serviço: " + carro.dataConserto);
		System.out.println("Categoria: " + carro.getCategoria());
		System.out.println("Valor total: " + carro.valorCobrado);
	}	
}