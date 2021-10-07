package exAulaDez;

import java.util.HashMap;
import java.util.Map;

public class VeiculoTeste {

	public static void main(String[] args) {
		Map<String, String > carros =  new HashMap<String, String>();
		carros.put( "CV " , " Celta");
		carros.put( "AD " , " Audi RS3");
		carros.put( "FT " , " Palio");
		carros.put( "FC " , " Focus");
		
		
		
		for(Map.Entry<String, String> entrada : carros.entrySet()) {
			System.out.println(entrada);
		}
	}

}
