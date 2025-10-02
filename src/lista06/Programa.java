package lista06;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter cliente data:");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Email: ");
		String mail = sc.nextLine();
		System.out.println("Birth date (DD/MM/YYYY): ");
		Date birth = sdf.parse(sc.next());
		Client client = new Client(name, mail, birth);
		
		System.out.println("Enter order data");
		System.out.println("Status: ");
		OrderStatus status  = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(), status, client);
		
		System.out.println("How many items to this order?");
		int item = sc.nextInt();
		
		for(int i=0; i<item;i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.println("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.println("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.println("Product quantity: ");
			int quantity = sc.nextInt();
			
			Product product = new Product(productName, productPrice);
			
			OrderItem it = new OrderItem(quantity, productPrice, product);
			
			order.addItem(it);
		}
		
		System.out.println();
		System.out.println(order);
	}

}
