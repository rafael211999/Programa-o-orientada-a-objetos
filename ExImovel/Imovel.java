package exercicio;

public class Imovel {
	public  int codIm;
	public String bairro;
	public String tipo;
	public int valor;
	
	public void CalcClass (double num) {

	    if (num > 50000) {

	        System.out.println("Imóvel de classe A");
	    }
	    if (num > 10000 && num < 50000 ) {

	        System.out.println("Imóvel de classe B");
	    }
	    if (num < 10000) {
	        System.out.println("Imóvel de classe C");
	    }
	 }
	
	 public void CalcAcre (String tipo, double valor) {
	     if (tipo == "casa") {
	         valor = valor * 1.05;
	        System.out.println("O valor com créssimo de (5%): " + valor);
	     }
	     else {
	         valor = valor * 1.08;
	            System.out.println("O valor com créssimo de (8%): " + valor);
	     }
	}
}