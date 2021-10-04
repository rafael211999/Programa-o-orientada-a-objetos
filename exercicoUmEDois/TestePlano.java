package exercicoUmEDois;

public class TestePlano {

	public static void main(String[] args) {
		Clinica clinica = new Clinica("Viva.", "Milenio.", "456.138.374/00001-20");
		Medico medico = new Medico ("Só resta Um.", "Rafael Alves", 5487624);
		Anestesista anestesista = new Anestesista("Para todos.", "Camila Nicodemus", 154762, "Peridural");
		ControleDePagamento cp = new ControleDePagamento();
		
		clinica.calcularPagamento();
		medico.calcularPagamento();
		anestesista.calcularPagamento();
		
		cp.calcValorTotal(clinica);
		cp.calcValorTotal(medico);
		cp.calcValorTotal(anestesista);
		
		System.out.println(clinica.toString());
		System.out.println(medico.toString());
		System.out.println(anestesista.toString());
		
		System.out.println("O valor total pago pelo plano é de: R$" + String.format("%.2f", cp.getTotalPago()));
	}

}
