package exercicioMercado;

public class TesteVendas {

	public static void main(String[] args) {
		BebidaAlcoolica produto1 = new BebidaAlcoolica("Cerveja", 12.00, "5%");
		BebidaAlcoolica produto2 = new BebidaAlcoolica("Vinho", 150.00, "20%");
		Eletrodomestico produto3 = new Eletrodomestico("Tv", 2000.00, "120v");
		Eletrodomestico produto4 = new Eletrodomestico("Geladeira", 2352.64, "220v");
		Eletrodomestico produto5 = new Eletrodomestico("Radio", 837.59, "120v");

		produto1.vender(5);
		produto2.vender(3);
		produto3.vender(9);
		produto4.vender(3);
		produto5.vender(1);
		
		
		System.out.println(produto1);
		System.out.println(produto2);
		System.out.println(produto3);
		System.out.println(produto4);
		System.out.println(produto5);
		
	}

}
