package exercicio;

public class MainImovel {

	public static void main(String[] args) {
		Imovel imovel1 = new Imovel();
		imovel1.codIm = 1;
		imovel1.bairro = "Centro";
		imovel1.tipo = "apto";
		imovel1.valor = 25000;
		
		Imovel imovel2 = new Imovel();
		imovel2.codIm = 2;
		imovel2.bairro = "Quitandinha";
		imovel2.tipo = "Casa";
		imovel2.valor = 98900;
		
		Imovel imclass1 = new Imovel();
		imclass1.CalcClass(imovel1.valor); 
		
		Imovel imclass2 = new Imovel();
		imclass2.CalcClass(imovel2.valor); 
		
        Imovel imoAcre = new Imovel();
        imoAcre.CalcAcre(imovel1.tipo, imovel1.valor);

        Imovel imoAcre2 = new Imovel();
        imoAcre2.CalcAcre(imovel2.tipo, imovel2.valor);

			
	}
	
}
