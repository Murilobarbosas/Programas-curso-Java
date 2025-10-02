package lista03;

public class Rectangle {
	public double width, height;
	
	public double Area() {
		return width * height;
	}
	
	public double Perimeter() {
		return 2 * (width + height);
	}
	
	public double Diagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}
	
	public String toString() {
		return "Area = " + String.format("%.2f", Area())
		+ "\nPerimeter = " + String.format("%.2f", Perimeter())
		+ "\nDiagonal = " + String.format("%.2f", Diagonal()) ;
	}
}
