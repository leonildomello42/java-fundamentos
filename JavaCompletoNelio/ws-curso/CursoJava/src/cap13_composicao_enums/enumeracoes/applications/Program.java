package cap13_composicao_enums.enumeracoes.applications;

import java.util.Date;

import cap13_composicao_enums.enumeracoes.entities.Order;
import cap13_composicao_enums.enumeracoes.entities.enums.OrderStatus;

public class Program {
	
	public static void main(String[] args) {
		
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os2);
		System.out.println(os1);
		
	}

}
