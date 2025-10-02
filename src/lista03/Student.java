package lista03;

public class Student {
	public String name;
	public double nota1, nota2, nota3;
	
	public double grade() {
		return nota1 + nota2 + nota3;
	}
	
	public String toString() {
		if(grade()>=60) {
			return "FINAL GRADE = " + String.format("%.2f", grade()) + "\nPASS";
		}
		return "FINAL GRADE = " + String.format("%.2f", grade())
					+ "\nFAILED\nMISSING " + String.format("%.2f", (60 - grade())) + " POINTS";
	}
}
