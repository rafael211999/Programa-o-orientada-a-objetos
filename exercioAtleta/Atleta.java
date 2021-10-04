package exercioAtleta;

public class Atleta implements Olimpiadas {
	private String nome;
	private double peso;
	private String modalidade;
	private int totalParticipantes;
	private Pais pais;
	
	

	public Atleta(String nome, double peso, String modalidade, int totalParticipantes, Pais pais) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.modalidade = modalidade;
		this.totalParticipantes = totalParticipantes;
		this.pais = pais;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public String getNome() {
		return nome;
	}

	public double getPeso() {
		return peso;
	}

	public int getTotalParticipantes() {
		return totalParticipantes;
	}

	public Pais getPais() {
		return pais;
	}
	
	@Override
	public String verificarSituacao() {
		String verificar = "";
		if(this.peso > 90) {
			this.modalidade = "Peso pesado.\n";
			verificar = "Participará\nModalidade: " + this.getModalidade() ;
		}else if(this.peso > 60 && this.peso < 90) {
			this.modalidade = "Peso médio.\n";
			verificar = "Participará\nModalidade: " + this.getModalidade();	
		}else {
			verificar = "Atleta não participará";
		}return verificar; 
	}
}