package ch04;

public class Customer {
	
	private String name;
	private int balance;
	
	public Customer(String name, int balance) {
		this.name = name;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}

	public void buyCoffee(Coffee coffee) {
		if(balance >= coffee.getPrice()) {
			balance -= coffee.getPrice();
			System.out.println(name + "님이 " + coffee.getName() + " 을 구매 하였습니다.");
		} else {
			System.out.println("잔액이 부족합니다.");
		}
	}
	
	
	
} // end of class
