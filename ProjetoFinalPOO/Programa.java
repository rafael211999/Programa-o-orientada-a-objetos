package ProjetoFinalPOO;

public abstract class Programa implements Classificar {
	protected String nome;
	protected Integer pontuacao;
	protected Categoria categoria;

	// Construtor
	public Programa(String nome, Categoria categoria) {
		super();
		this.nome = nome;
		this.categoria = categoria;
	}

	public void classificar(int classificacao) throws ClassificacaoInvalida {

		try {
			if (classificacao < 0 || classificacao > 5) {
				throw new ClassificacaoInvalida("Classificação inválida.");
			} else {
				this.pontuacao = classificacao;
			}
		} catch (ClassificacaoInvalida e) {
			System.out.println(e.getMessage());
		}
	}

	// Coloca novo nome.
	public void setNome(String nome) {
		this.nome = nome;
	}

	// Retorna o nome atual.
	public String getNome() {
		return this.nome;
	}

	// Coloca nova categoria.
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	// Retorna categoria
	public Categoria getCategoria() {
		return this.categoria;
	}

	// Retorna categoria em string
	public String getCategoriaString() {
		String c = "";
		if (this.categoria.equals(Categoria.COMEDIA)) {
			c = "Comedia";
		} else if (this.categoria.equals(Categoria.FANTASIA)) {
			c = "Fantasia";
		} else if (this.categoria.equals(Categoria.TERROR)) {
			c = "Terror";
		}
		return c;
	}

}
