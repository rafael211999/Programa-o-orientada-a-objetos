package exercicioTres;

public class TesteEndereco {

	public static void main(String[] args) {
		Estado estado1 = new Estado("Rio de Janeiro", "RJ");
		Estado estado2 = new Estado("Minas gerais", "MG");
		
		Cidade cidade1 = new Cidade("Teresópolis", estado1);
		Cidade cidade2 = new Cidade("Juiz de Fora", estado2);
		
		Endereco endereco1 = new Endereco("Rua Camelia dos Santos N°348", "Centro", "54862-489", cidade1);
		Endereco endereco2 = new Endereco("Rua Carmem  Couto N°568", "Centro", "98763-957", cidade2);
		
		Contato contato1 = new Contato("Rafael Alves", endereco1);
		Contato contato2 = new Contato("Julia Canto", endereco2);
		
		Telefone telefone1 = new Telefone("57854-658");
		Telefone telefone2 = new Telefone("32765-378");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone1;
		telefones[1] = telefone2;
		
		
		contato1.setTelefones(telefones);
		contato2.setTelefones(telefones);
		
		ImprimirContato(contato1);
		ImprimirContato(contato2);
		
		}
		
		public static void ImprimirContato(Contato contato) {
			
		System.out.println("Nome:" + contato.getNome());
		System.out.println("Endereço:" + contato.getEndereco().EnderecoCompleto());
		
		}
	
	}
