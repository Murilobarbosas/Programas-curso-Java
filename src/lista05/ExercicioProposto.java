package lista05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioProposto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<ModelEP> al = new ArrayList<>();
		
		System.out.println("How many employees will be registered?");
		int quantidade = sc.nextInt();
		
		for(int i=0;i<quantidade;i++) {
			System.out.println("Employee" + i);
			System.out.println("ID:");
			int id = sc.nextInt();
			while(hasID(al, id)) {
				System.out.println("ID already taken! Try again: ");
				id=sc.nextInt();
			}
			System.out.println("Name:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salary:");
			double salario = sc.nextDouble();
			ModelEP mep = new ModelEP(id, name, salario);
			al.add(mep);
		}
		
		System.out.println("Enter the employee id that will have salary increase: ");
		int empregado = sc.nextInt();
		
		//Integer pos = position(list, empregado);
		
		ModelEP mep = al.stream().filter(x -> x.getId()==empregado).findFirst().orElse(null);
		
		//if(pos==null){
		if(mep == null) {
			System.out.println("This id does not exist");
		}else{
			System.out.println("Enter the percentage: ");
			double aumento = sc.nextDouble();
			//list.get(pos).increaseSalary(aumento);
			mep.increaseSalary(aumento);
		}
		
		System.out.println("List of employees: ");
		for(ModelEP ep: al) {
			System.out.println(ep);
		}
		
		sc.close();
	}
	
	public static Integer position(List<ModelEP> list, int id) {
		for(int i=0;i<list.size(); i++) {
			if(list.get(i).getId()==id) {
				return i;
			}
		}
		return null;
	}
	
	public static boolean hasID(List<ModelEP> list, int id) {
		ModelEP mep = list.stream().filter(x->x.getId()==id).findFirst().orElse(null);
		return mep != null;
	}
}
