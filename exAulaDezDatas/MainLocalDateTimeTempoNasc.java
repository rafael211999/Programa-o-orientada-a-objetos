package exAulaDez01;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class MainLocalDateTimeTempoNasc {

	public static void main(String[] args) {
		LocalDateTime aniversario = LocalDateTime.of(1999, Month.OCTOBER, 8, 22, 5);
		LocalDate hoje = LocalDate.now();
		Duration duracao = Duration.between(aniversario, hoje);
		DateTimeFormatter formantandoABarra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		
		System.out.println("Data Nascimento:" +aniversario.format(formantandoABarra));
		System.out.println("Hoje: "+hoje.format(formantandoABarra));
		
		System.out.println("Ano de Nascimento era bissexto:"+ aniversario.toLocalDate().isLeapYear());
		
		
		System.out.println("Desde quando eu nasci se passaram "+ duracao.getSeconds()+" segundos" );

		
		
	}

	
}
