package ExeercicioUm;
//Declarando a classe e seus atributos;
public class Empregado {
	private String nome;
	private String sobrenome;
	private double salario;
	
// Criando  o construtor de classes com a inicialização de atributos;
	public Empregado(String nome, String sobrenome, double salario) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salario = salario;
	}
	
// Criando os Get and Set;
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSobrenome() {
		return sobrenome;
	}


	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}


	public Double getSalario() {
		return salario;
	}


	public void setSalario(Double salario) {
		this.salario = salario;
	}


// Criando o método para verificar o Imposto de Renda.
	public double calculaImpostoRenda(double valor) {
		if(valor < 1903.98) {
			
		}else if(valor >= 1903.98 && valor < 2826.65) {
			valor = valor - (valor * 0.075 );	
		}else if(valor >= 2826.65 && valor < 3751.05) {
			valor = valor - (valor * 0.15);
		}else if (valor >= 3751.05 && valor < 4664.68) {
			valor = valor - (valor * 0.225);
		}else if (valor > 4664.68) {
			valor = valor - (valor * 0.275);
		}
		return valor;
	}
// Criando o método para imprimir o valor dos Empregados.	
	public void imprimirEmpregado() {
		System.out.printf("Empregado:%s ", getNome());
		System.out.printf("%s", getSobrenome());
		System.out.printf("\nSalario:R$%.2f \n", getSalario());
	}
}
