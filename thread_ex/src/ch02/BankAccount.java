package ch02;

import ch01.threadTest01;

// sharedResource 상황을 구현해 보자.
public class BankAccount {

	int money = 100_000;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	// 출금, 입금
	// synchronized <-- 동기화 처리 진행
	public synchronized void saveMoney(int money) {
		int currentMoney = getMoney();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		setMoney(currentMoney + money);
		System.out.println("입금 후 계좌 잔액: " + getMoney());
	}

	public synchronized int widthDraw(int money) {
		// 현재 출금할 때 10만원 상태
		int currentMoney = getMoney();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		if (currentMoney >= money) {
			setMoney(currentMoney - money);
			System.out.println("출금 후 계좌 잔액: " + getMoney());
			return money;
		} else {
			System.out.println("잘못된 입력 입니다.");
			return 0;
		}
	}

} // end of class

class Father extends Thread {
	BankAccount account;

	public Father(BankAccount account) {
		this.account = account;
	}

	@Override
	public void run() {
		account.saveMoney(10_000);
	}
} // end of class

class Mother extends Thread {
	BankAccount account;

	public Mother(BankAccount account) {
		this.account = account;
	}

	@Override
	public void run() {
		account.widthDraw(5_000);
	}
} // end of class