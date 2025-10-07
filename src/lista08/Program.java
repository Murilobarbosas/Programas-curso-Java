package lista08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		String file = "C:\\Users\\Murilo\\Desktop\\arquivo.csv";
		List<Product> prod = new ArrayList<>();
		File fl = new File(file);
		String source = fl.getParent();
		
		boolean sucess = new File(source+"\\out").mkdir();
		
		String target = source +"\\out\\summary.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))){
			String itemCsv = br.readLine();
			while (itemCsv != null) {
				System.out.println(itemCsv);
				
				String[] fields = itemCsv.split(",");
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);
				
				prod.add(new Product(name, price, quantity));
				
				itemCsv = br.readLine();
			}
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(target))){
				bw.write("Output file");
				bw.newLine();
				for(Product item : prod) {
					bw.write(item.toString());
					bw.newLine();
				}
				System.out.println(target + "CREATED");
			}catch(IOException e) {
				System.out.println("Error writing file: " + e.getMessage());
			}
		}catch(IOException e) {
			System.out.println("Error writing file: " + e.getMessage());
		}
	}

}
