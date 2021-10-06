package aula;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario[] = new Funcionario[2];
		funcionario[0] = new Funcionario();
		funcionario[0].setNome("Rafael Alves de Souza");
		funcionario[0].setCargo("Programador");
		funcionario[0].setSalario(15000.00);
		
		funcionario[1] = new Funcionario();
		funcionario[1].setNome("Gilnei lima");
		funcionario[1].setCargo("Gerente");
		funcionario[1].setSalario(18000.00);
		
		for(int i = 0; i < funcionario.length; i++) {
			System.out.println("\nNome:" + funcionario[i].getNome() + "\nCargo:" + funcionario[i].getCargo() + "\nSalario:" + funcionario[i].getSalario());
			System.out.println("Salario com abono:" + funcionario[i].abonoSalario(4000));
		
			}
		}
	}


