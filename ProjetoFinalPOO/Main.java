package ProjetoFinalPOO;

import java.util.Scanner;

public class Main {

	static Scanner scanner = new Scanner(System.in);

	private static String novoNome = "", nome;

	static Biblioteca biblioteca = new Biblioteca();

	public static void main(String[] args) throws ClassificacaoInvalida {
		// String menuPrincipal = ";

		biblioteca.addPrograma(new Filme("2012", Categoria.COMEDIA, 120));
		biblioteca.addPrograma(new Serie("AS candangas", Categoria.TERROR, 5, 10));
		biblioteca.addPrograma(new Filme("PA PuM", Categoria.FANTASIA, 120));
		System.out.println("");

		System.out.println("### Welcome to SerraFlix! ###\n ");

		menuPrincipal();

		System.out.println();

		scanner.close();
	}

	// Interface para Ver o catalogo ou entrar no menu.
	public static void menuPrincipal() throws ClassificacaoInvalida {

		int input;
		do {
			System.out.println("\n<< Menu principal >>\n" + "Digite o n�mero do que deseja fazer :\n"
					+ "1 - Ver catalogo de filmes e series.\n" + "2 - Menu de edi��o\n" + "3 - Classificar um titulo\n"
					+ "0 - Encerrar SerraFlix. \n");
			input = scanner.nextInt();

			switch (input) {
			case 1:
				System.out.println("\n" + biblioteca.getProgramas());
				break;
			case 2:
				telaEdicao();
				break;
			case 3:
				classificarTitulo();
				break;
			case 0:
				System.out.println("\nTenha um �timo dia, volte sempre !\n");
				break;
			default:
				System.out.println("((( Op��o invalida, tente  outra vez !!! )))");
			}
		} while (input != 0);

		// scanner.close();
	}

	public static void classificarTitulo() throws ClassificacaoInvalida {
		int input;
		System.out.println("Qual titulo voc� seseja classificar ?");
		scanner.nextLine();
		nome = scanner.nextLine();

		if (biblioteca.seExiste(nome)) {
			if (biblioteca.isSerie(nome)) {
				System.out.println("Classifique " + nome + " de 0 a 10");
				input = scanner.nextInt();
				biblioteca.classificar(nome, input);
				if (input >= 0 && input <= 10) {
					System.out.println("Classificado com sucesso!");
				}
			} else {
				System.out.println("Classifique " + nome + " de 0 a 5");
				input = scanner.nextInt();
				biblioteca.classificar(nome, input);
				if (input >= 0 && input <= 5) {
					System.out.println("Classificado com sucesso!");
				}
			}
		} else {
			System.out.println(" *** Titulo inexistente ***");
		}
	}

	// Interface para Escolher o que deseja fazer.
	public static void telaEdicao() {
		int input;
		do {

			System.out.println("\n## Menu de edi��o ##.\n" + "Escolha uma das op��es:\n" + "1 - Adicionar nova s�rie.\n"
					+ "2 - Adicionar novo filme.\n" + "3 - Editar.\n" + "0 - Retornar para o menu principal.");
			input = scanner.nextInt();
			switch (input) {
			case 1:
				adicionarSerie();
				break;
			case 2:
				adicionarFilme();
				break;
			case 3:
				editar();
				break;
			case 0:
				break;
			default:
				System.out.println("\n*** Op��o inv�lida. ***\n");
			}

		} while (input != 0);

		// scanner.close();
	}

	// Interface para adicionar series;
	public static void adicionarSerie() {
		int entrada;
		Categoria categoria = null;
		int nTemporadas;
		int nEpisodios;

		System.out.println("Qual o titulo da s�rie ?\n");
		scanner.nextLine();
		nome = scanner.nextLine();
		if (biblioteca.seExiste(nome)) {
			System.out.println("\nEsse titulo j� est� cadastrado.");
		} else {
			do {
				System.out.println("Qual o numero de temporadas:");
				nTemporadas = scanner.nextInt();
				if (nTemporadas <= 0) {
					System.out.println(" *** N�mero de temporadas inv�lido ***\n");
				}
			} while (nTemporadas <= 0);

			do {
				System.out.println("Qual o numero de episodios:");
				nEpisodios = scanner.nextInt();
				if (nEpisodios <= 0) {
					System.out.println("*** N�mero de epi�dios inv�lido ***\n");
				}
			} while (nEpisodios <= 0);

			do {
				System.out.println("\nQual o g�nero da s�rie ? Digite o n�mero correspondente: \n" + "1 - Com�dia \n"
						+ "2 - Fantasia \n" + "3 - Terror\n");
				entrada = scanner.nextInt();
				switch (entrada) {
				case 1:
					categoria = Categoria.COMEDIA;
					break;
				case 2:
					categoria = Categoria.FANTASIA;
					break;
				case 3:
					categoria = Categoria.TERROR;
					break;
				default:
					System.out.println(" *** Op��o invalida ***\n");
				}
			} while (entrada < 1 || entrada > 5);

			biblioteca.addPrograma(new Serie(nome, categoria, nTemporadas, nEpisodios));
			System.out.println("\nS�rie criada com sucesso!\n");
		}
	}

	// Interface para adiocionar filme.
	public static void adicionarFilme() {
		int input;
		int duracao;
		Categoria categoria = null;

		System.out.println("Qual o nome do filme ?\n");
		scanner.nextLine();
		nome = scanner.nextLine();

		if (biblioteca.seExiste(nome)) {
			System.out.println("\n *** Esse titulo j� est� cadastrado ***\n");
		} else {
			System.out.println("Qual o tempo de dura��o do filme: ");
			duracao = scanner.nextInt();
			do {
				System.out.println("\nQual o g�nero do filme ? Digite o n�mero correspondente: \n" + "1 - Com�dia \n"
						+ "2 - Fantasia \n" + "3 - Terror");
				input = scanner.nextInt();
				switch (input) {
				case 1:
					categoria = Categoria.COMEDIA;
					break;
				case 2:
					categoria = Categoria.FANTASIA;
					break;
				case 3:
					categoria = Categoria.TERROR;
					break;
				default:
					System.out.println(" *** Op��o inv�lida ***\n");
				}
			} while (input < 1 || input > 5);

			biblioteca.addFilme(new Filme(nome, categoria, duracao));
			System.out.println("\nFilme criado com sucesso!\n");
		}
	}

	// Menu de edi��o;
	public static void editar() {
		System.out.println("Digite o titulo que deseja editar:");
		scanner.nextLine();
		nome = scanner.nextLine();

		if (biblioteca.seExiste(nome)) {
			if (biblioteca.isSerie(nome)) {
				editarSerie();
			} else {
				editarFilme();
			}
		} else {
			System.out.println("\n *** Titulo n�o encontrado ***!\n");
		}
	}

	// metodo para editar serie
	public static void editarSerie() {
		int nTemporada;
		int nEpisodios;
		int input;

		do {
			System.out.println("Voc� deseja:\n" + "1 - Editar nome.\n" + "2 - Editar categoria.\n"
					+ "3 - Atualizar temporadas.\n" + "4 - Remover s�rie\n" + "0 - Voltar");
			input = scanner.nextInt();
			switch (input) {
			case 0:
				break;
			case 1:
				editarNome();
				System.out.println("Nome alterado para " + novoNome + "\n");
				break;
			case 2:
				editarGenero(nome);
				System.out.println("G�nero alterado\n");
				break;
			case 3:
				do {
					System.out.println("Digite o numero de temporadas:");
					nTemporada = scanner.nextInt();
					if (nTemporada < 1) {
						System.out.println("\n *** Digite um numero maior que 0 ***");
					}
				} while (nTemporada < 1);

				do {
					System.out.println("Digite o numero de episodeios:");
					nEpisodios = scanner.nextInt();
					if (nTemporada < 1) {
						System.out.println("\n *** Digite um numero maior que 0 ***");
					}
				} while (nEpisodios < 1);

				biblioteca.editarCampoTemporada(nome, nTemporada, nEpisodios);
				System.out.println("Temporadas atualizadas.");
				break;
			case 4:
				System.out.println("T�tulo " + nome + " removido com sucesso!");
				biblioteca.removerPrograma(nome);
				break;
			default:
				System.out.println("\n *** Numero invalido, escolha uma op��o valida *** ");
			}
		} while (input != 0 && input != 4);
	}

	// Metodo editar filme
	public static void editarFilme() {
		int input;
		int duracao;
		do {
			System.out.println("Voc� deseja:\n" + "1 - Editar nome.\n" + "2 - Editar categoria.\n"
					+ "3 - Editar dura��o\n" + "4 - Remover filme\n\n" + "0 - Voltar\n");
			input = scanner.nextInt();
			switch (input) {
			case 1:
				editarNome();
				System.out.println("Nome alterado para " + novoNome + "\n");
				break;
			case 2:
				editarGenero(nome);
				System.out.println("G�nero alterado\n");
				break;
			case 3:
				do {
					System.out.println("Digite o tempo de dura��o do filme em minutos:");
					duracao = scanner.nextInt();
					if (duracao < 1) {
						System.out.println("\n ***Digite um numero maior que 0 ***");
					}
				} while (duracao < 1);

				biblioteca.editarDuracao(nome, duracao);
				System.out.println("Dura��o atualizada.");

				break;
			case 4:
				System.out.println("T�tulo " + nome + " removido com sucesso!");
				biblioteca.removerPrograma(nome);
				break;
			default:
				System.out.println("\n *** Numero invalido, escolha uma op��o valida ***\n");
			}
		} while (input != 0 && input != 4);

	}

	public static void editarNome() {
		System.out.println("\nInforme o novo nome:");
		scanner.nextLine();
		novoNome = scanner.nextLine();
		biblioteca.editarCampoNome(nome, novoNome);
		nome = novoNome;
	}

	// Metodo para editar genero
	public static void editarGenero(String nome) {
		Categoria categoria = null;
		int input;
		do {
			System.out.println("Escolha um novo g�nero:\n" + "1 - Terror\n" + "2 - Com�dia\n" + "3 - Fantasia\n"
					+ "0 - Cancelar ");
			input = scanner.nextInt();
			switch (input) {
			case 1:
				categoria = Categoria.TERROR;
				break;
			case 2:
				categoria = Categoria.COMEDIA;
				break;
			case 3:
				categoria = Categoria.FANTASIA;
				break;
			case 0:
				break;
			default:
				System.out.println("Numero invalido. Ecolha uma das op��es acima !!!");

			}
		} while (input < 0 || input > 3);
		if (input == 0) {
			System.out.println(" *** G�nero n�o alterado *** \n");
		} else {
			biblioteca.editarCampoCategoria(nome, categoria);
			System.out.println("G�nero atualizado com sucesso! \n");
		}
	}

}