package lista03;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student stu = new Student();
		
		System.out.println("Informe o nome e as notas do aluno");
		stu.name = sc.nextLine();
		stu.nota1 = sc.nextDouble();
		stu.nota2 = sc.nextDouble();
		stu.nota3 = sc.nextDouble();
		
		System.out.println(stu.toString());
		
		sc.close();
	}

}
