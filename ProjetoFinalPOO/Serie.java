package ProjetoFinalPOO;

import java.util.ArrayList;
import java.util.List;

public class Serie extends Programa {
	List<Temporada> temporadas = new ArrayList<Temporada>();

	public Serie(String nome, Categoria categoria, int temporadas, int episodios) {
		super(nome, categoria);

		for (int i = 0; i < temporadas; i++) {
			this.temporadas.add(new Temporada(episodios, i + 1));
		}
	}

	public void addTemporada(int temporada, int episodios) {
		temporadas.add(temporada - 1, new Temporada(temporada, episodios));
	}

	@Override
	public void classificar(int classificacao) throws ClassificacaoInvalida {
		try {
			if (classificacao < 0 || classificacao > 10) {
				throw new ClassificacaoInvalida("Classificação inválida.");
			} else {
				super.pontuacao = classificacao;
			}
		} catch (ClassificacaoInvalida e) {
			System.out.println(e.getMessage());
		}
	}

	public int getQtdTemporadas() {
		int qtd = 0;
		for (Temporada t : temporadas) {
			qtd++;
		}
		return qtd;
	}

	public List<Temporada> getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(ArrayList<Temporada> temporadas) {
		this.temporadas = temporadas;
	}

	public void editarTemporadas(int temporadas, int episodios) {
		this.temporadas.removeAll(this.temporadas);

		for (int i = 0; i < temporadas; i++) {
			this.temporadas.add(new Temporada(episodios, i + 1));
		}
	}

}
