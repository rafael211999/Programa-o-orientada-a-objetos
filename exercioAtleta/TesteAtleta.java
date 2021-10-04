package exercioAtleta;

public class TesteAtleta {

	public static void main(String[] args) {
		Pais pais1 = new Pais("Afeganistão");
		Pais pais2 = new Pais("Colombia");
		
		Atleta atleta1 = new Atleta("Cleitinho", 90.5, "Boxe", 1,  pais1 );
		Atleta atleta2 = new Atleta("Rafael", 73.5, "Natação", 1,  pais2 );
		Atleta atleta3 = new Atleta("Gilnei", 110.5, "Sumo", 1,  pais2 );
		
		System.out.println(atleta1.verificarSituacao());
		System.out.println(atleta2.verificarSituacao());
		System.out.println(atleta3.verificarSituacao());
		

	}

}
