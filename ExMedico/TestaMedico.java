package aulas;

public class TestaMedico {
	public static void main(String[] args) {
		Medico med = new Medico();
		med.crm = "12345";
		med.nome = "Ana Maria";
		med.salario = 0;
		med.valorConsulta = 250;
	
	Medico med2 = new Medico("456789", "Ant�nio", 0, 300);	
	 System.out.println(Medico.totalMedico);
	
		med.pagamentoDinheiro();
		med2.pagamentoPlano();
		
		System.out.println("Doutora");
        System.out.println("Nome: " + med.nome);
        System.out.println("CRM: " + med.crm);
        System.out.println("Valor da consulta: " + med.valorConsulta);
        System.out.println("Sal�rio desse m�s: " + med.salario);

        System.out.println("\n");

        System.out.println("Doutor");
        System.out.println("Nome: " + med2.nome);
        System.out.println("CRM: " + med2.crm);
        System.out.println("Valor da consulta: " + med2.valorConsulta);
        System.out.println("Sal�rio desse m�s: " + med2.salario);
	}
}