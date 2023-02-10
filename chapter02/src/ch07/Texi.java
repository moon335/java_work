package ch07;

public class Texi {

	private String texiCompany;
	private int money;
	private final int price;
	
	public Texi(String texiCompany) {
		this.texiCompany = texiCompany;
		price = 10_000;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void take() {
		money += 10_000;
	}
	
}
