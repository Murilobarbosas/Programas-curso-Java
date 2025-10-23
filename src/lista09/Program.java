package lista09;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre os dados do contrato:");
		System.out.println("Numero:");
		int number = sc.nextInt();
		System.out.println("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println("Valor do contrato: ");
		double value = sc.nextDouble();
		Contract obj = new Contract(number, date, value);
		
		System.out.println("Entre com o numero de parcelas: ");
		int parcelas = sc.nextInt();
		
		ContractService contractService = new ContractService(new PaypalServices());
		contractService.processContract(obj, parcelas);
		
		System.out.println("PARCELAS:");
		for(Installment installment: obj.getList()) {
			System.out.println(installment);
		}
		sc.close();
	}

}
