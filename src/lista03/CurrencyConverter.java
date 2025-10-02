package lista03;

public class CurrencyConverter {
	public double price, dollar;
	public static final double IOF = 0.06;
	
	public double Amount() {
		return price * (dollar + (dollar * IOF));
	}
}
