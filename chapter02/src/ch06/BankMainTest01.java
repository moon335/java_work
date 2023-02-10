package ch06;

public class BankMainTest01 {

	// 메인 함수
	public static void main(String[] args) {
		
		Bank bankB = new Bank();
		bankB.deposit(10_000);
		bankB.withDraw(6_000);
		
		// 신입 개발자가 실수로 멤버 변수에 접근해서 수정
		// 실수 ----> 입금(기능), 출금(기능)
		//bankB.balance = 100_000; // private로 선언하는 순간 외부에서 접근 불가
		// 실수 할 가능성이 생긴다.
		// 예방 -> 접근 제어지시자를 할당한다. --> private
		// 정보 출력
		bankB.showInfo();
		
		// 현재 금액에 대한 정보만 받고 싶다면
		int currentMoney = bankB.getBalance();
		System.out.println("currentMoney: " + currentMoney);
		
		// set 메서드 사용해보기
		bankB.setBalance(-200_000);
		bankB.showInfo();
		
		// 멤버변수와 메서드의 차이점은 메서드는 실행의 흐름에 추가할 수 있음
		
	} // end of main

} // end of class
