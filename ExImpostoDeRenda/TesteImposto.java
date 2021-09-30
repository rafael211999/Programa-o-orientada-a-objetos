package ExTres;

public class TesteImposto {

	public static void main(String[] args) {
		PessoaFisica fisica = new PessoaFisica("Rafael", 100000.00, "123", "546");
		PessoaFisica juridica = new PessoaFisica("Pietra", 50000.00, "1345", "312");

		fisica.calculoIr();
		juridica.calculoIr();
		
		System.out.println(fisica);
		System.out.println(juridica);
	}

}
