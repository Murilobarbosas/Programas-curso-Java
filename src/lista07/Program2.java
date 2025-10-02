package lista07;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.println("Enter the number od products:");
		int products = sc.nextInt();
		
		for(int i=0; i<products;i++) {
			System.out.println("Product #" + i + " data:");
			System.out.println("Common, used or imported (c/u/i)? ");
			char p = sc.next().charAt(0);
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Price: ");
			double price = sc.nextDouble();
			if(p=='i') {
				System.out.println("Customs fee: ");
				double fee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, fee));
			}else if(p=='u') {
				System.out.println("Manufacture date (DD/MM/YYYY): ");
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new UsedProduct(name, price, date));
			}else if(p=='c') {
				list.add(new Product(name, price));
			}
			
		}
		System.out.println();
		System.out.println("Etiquetas de Preço");
		for(Product prod:list) {
			System.out.println(prod.priceTag());
		}

	}

}
