package lista07;

public class ImportedProduct extends Product{
	private Double customsFee;
	
	public ImportedProduct(String name, double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public ImportedProduct(Double customsFee) {
		super();
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public double totalPrice() {
		return getPrice() + getCustomsFee();
	}
	
	@Override
	public String priceTag() {
		return getName() + " $ 0 " + getPrice() + "(Customs fee: $ " + String.format("%.2f", customsFee) +")";
	}
}
