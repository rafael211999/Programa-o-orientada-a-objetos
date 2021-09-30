package ExercicioDois;

import java.time.LocalDate;

public class TestePedido {
	
	public static void main(String[] args) {
	
			Pedido pedido1 = new Pedido(1,LocalDate.now() , 1, 2.50);
			Pedido pedido2 = new Pedido(4, LocalDate.of(2021, 8, 10), 5, 2.99);
			Pedido pedido3 = new Pedido(7, LocalDate.of(2021, 10, 15), 9, 5.50);
			
			pedido1.finalizar();
			pedido2.finalizar();
			pedido3.finalizar();
			
			System.out.println(pedido1.getTotal());
			System.out.println(pedido2.getTotal());
			System.out.println(pedido3.getTotal());
		}
		
	}


