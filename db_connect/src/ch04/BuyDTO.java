package ch04;

public class BuyDTO {
	
	private String userName;
	private String prodName;
	private int price;
	private int amount;
	
	public BuyDTO(String userName, String prodName, int price, int amount) {
		this.userName = userName;
		this.prodName = prodName;
		this.price = price;
		this.amount = amount;
	}

	public String getUserName() {
		return userName;
	}

	public String getProdName() {
		return prodName;
	}

	public int getPrice() {
		return price;
	}

	public int getAmount() {
		return amount;
	}
	
} // end of class
