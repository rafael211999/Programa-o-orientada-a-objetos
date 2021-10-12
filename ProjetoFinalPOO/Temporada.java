package ProjetoFinalPOO;

public class Temporada {
	private int numeroDeEpisodios;
	private int numeroTemporada;

	public Temporada(int numeroDeEpisodios, int numeroTemporada) {
		super();
		this.numeroDeEpisodios = numeroDeEpisodios;
		this.numeroTemporada = numeroTemporada;
	}

	public int getNumeroDeEpisodios() {
		return numeroDeEpisodios;
	}

	public void setNumeroDeEpisodios(int numeroDeEpisodios) {
		this.numeroDeEpisodios = numeroDeEpisodios;
	}

	public int getNumeroTemporada() {
		return numeroTemporada;
	}

	public void setNumeroTemporada(int numeroTemporada) {
		this.numeroTemporada = numeroTemporada;
	}

	@Override
	public String toString() {
		return "\nTemporada: " + this.numeroTemporada + ", " + this.numeroDeEpisodios + " episódios.";
	}
}
