package ch02;

public class MainTest01 {

	// 메인 함수
	public static void main(String[] args) {
		
		// 현재 잔액 100_000원
		BankAccount bankAccount = new BankAccount();
		
		// sharedResource 상태
		Father father = new Father(bankAccount);
		
		Mother mother = new Mother(bankAccount);
		
		// 아버지 입금하기
		father.start(); // 3초 걸림
		mother.start();
		
		// 어머니 출금하기
		
		// 정상처리: 10만원 + 1만원 - 5천원 = 10만 5천원 <-- 정상 동작
		
	} // end of main

} // end of class
