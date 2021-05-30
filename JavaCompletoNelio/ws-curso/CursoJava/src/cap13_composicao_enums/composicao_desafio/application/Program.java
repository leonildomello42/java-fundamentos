package cap13_composicao_enums.composicao_desafio.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import cap13_composicao_enums.composicao_desafio.model.entities.Client;
import cap13_composicao_enums.composicao_desafio.model.entities.Order;
import cap13_composicao_enums.composicao_desafio.model.entities.OrderItem;
import cap13_composicao_enums.composicao_desafio.model.entities.Product;
import cap13_composicao_enums.composicao_desafio.model.enums.OrderStatus;

public class Program {
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name = sc.nextLine();	

		System.out.print("Email: ");
		String email = sc.nextLine();
		
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data:");
		
		System.out.print("status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(), status, client);
		
		System.out.println("How many items to this order? ");
		
		 int count = sc.nextInt();
		 
		 for(int i = 1; i <= count; i++) {
			 
				System.out.println("Enter #" + i + " item data:");
				
				System.out.print("Product name: ");
				sc.nextLine();
				String productName = sc.nextLine();
				
				System.out.print("Product price: ");
				double productPrice = sc.nextDouble();

				Product product = new Product(productName, productPrice);
				
				System.out.print("Quantity: ");
				int quantity = sc.nextInt();
				
				OrderItem orderItem = new OrderItem(quantity, productPrice, product);
				
				order.addItem(orderItem);
		 }
		 
			System.out.println();
			System.out.println("ORDER SUMMARY:");
			System.out.println(order);
		
		sc.close();
	}
}
