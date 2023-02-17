package ch01;

public class ThreadTest2 {

	// 메인 쓰레드
	public static void main(String[] args) {
		// 사용하는 방법 연습
		// 현재 쓰레드가 누구인지 알아보는 명령어
		System.out.println("-------------main 쓰레드 시작---------------------");
		System.out.println(Thread.currentThread());
		// 작업자 하나 만들어 내기(메인 쓰레드가 일 함)
		Worker worker1 = new Worker("워커1");
		// 너가 위임 받은 일을 시작해 --> start();
		worker1.start();
		
		// 쓰레드 (작업자) 하나 더 생성해보기
		Worker worker2 = new Worker("워커2");
		
		worker2.start();
		Worker1 worker12 = new Worker1();
		worker12.start();
		System.out.println("-------------main 쓰레드 종료---------------------");
		
		
	} // end of main

} // end of class

class Worker1 extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("-");
		}
	}
}