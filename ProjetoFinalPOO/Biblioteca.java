package ProjetoFinalPOO;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	// private List<Programa> programas;
	List<Programa> programas = new ArrayList<Programa>();

	public Biblioteca() {

	}

	public void classificar(String nome, int pontuacao) throws ClassificacaoInvalida {
		for (Programa p : programas) {
			if (p.getNome().equals(nome)) {
				if (p instanceof Serie) {
					((Serie) p).classificar(pontuacao);
				} else if (p instanceof Filme) {
					((Filme) p).classificar(pontuacao);
				}
			}
		}
	}

	// Adicionar Filmes
	public void addFilme(Filme filme) {
		this.programas.add(filme);

	}

	// Adicionando Series
	public void addPrograma(Serie serie) {
		this.programas.add(serie);
	}

	public String getProgramas() {
		String comedia = "Comedia:\n", terror = "Terror:\n", fantasia = "Fantasia:\n";

		for (Programa p : programas) {
			String pont = " || ";
			if (p.pontuacao != null) {
				pont = " || <3 " + p.pontuacao;
			}
			if (p instanceof Filme) {
				int duracao = ((Filme) p).getDuracao();
				if (p.getCategoria().equals(Categoria.COMEDIA)) {
					comedia += ("\n" + p.getNome() + " || " + duracao + "m" + pont);
				} else if (p.getCategoria().equals(Categoria.TERROR)) {
					terror += ("\n" + p.getNome() + " || " + duracao + "m" + pont);
				} else if (p.getCategoria().equals(Categoria.FANTASIA)) {
					fantasia += ("\n" + p.getNome() + " || " + duracao + "m" + pont);
				}
			} else if (p instanceof Serie) {
				int temporadas = ((Serie) p).getQtdTemporadas();
				if (p.getCategoria().equals(Categoria.COMEDIA)) {
					comedia += ("\n" + p.getNome() + " || " + temporadas + " temporadas" + pont);
				} else if (p.getCategoria().equals(Categoria.TERROR)) {
					terror += ("\n" + p.getNome() + " || " + temporadas + " temporadas" + pont);
				} else if (p.getCategoria().equals(Categoria.FANTASIA)) {
					fantasia += ("\n" + p.getNome() + " || " + temporadas + " temporadas" + pont);
				}
			}

		}
		return (comedia + "\n\n==========\n\n" + terror + "\n\n==========\n\n" + fantasia);

	}

	public void trocarCategoria(String nome, Categoria novaCategoria) {
		for (Programa p : programas) {
			if (p.nome.equals(nome)) {
				p.setCategoria(novaCategoria);
			}
		}
	}

	public Boolean seExiste(String nome) {
		for (Programa p : this.programas) {
			if (p.getNome().equals(nome)) {
				return true;
			}
		}
		return false;
	}

	public void addPrograma(Filme filme) {
		this.addFilme(filme);
	}

	public void removerPrograma(String nome) {
		for (Programa p : programas) {
			if (p.getNome().equals(nome)) {
				this.programas.remove(p);
				break;
			}
		}

	}

	public void editarCampoNome(String nome, String novoNome) {
		for (Programa p : this.programas) {
			if (p.getNome().equals(nome)) {
				p.setNome(novoNome);

			}
		}
	}

	public void editarCampoCategoria(String nome, Categoria categoria) {
		for (Programa p : programas) {
			if (p.getNome().equals(nome)) {
				p.setCategoria(categoria);
			}
		}
	}

	public Boolean isSerie(String nome) {
		for (Programa p : programas) {
			if (p.getNome().equals(nome)) {
				if (p instanceof Serie) {
					return true;
				}
			}
		}
		return false;
	}

	public void editarCampoTemporada(String nome, int temporadas, int episodios) {
		for (Programa p : programas) {
			if (p.getNome().equals(nome)) {
				if (p instanceof Serie) {
					((Serie) p).editarTemporadas(temporadas, episodios);
				}
			}
		}
	}

	public void editarDuracao(String nome, int duracao) {
		for (Programa p : programas) {
			if (p.getNome().equals(nome)) {
				if (p instanceof Filme) {
					((Filme) p).setDuracao(duracao);
				}
			}
		}
	}

}
