package ch01;

public class ThreadTest3 {

	public static void main(String[] args) {
		
		System.out.println("------------메인 시작-------------");
		System.out.println(Thread.currentThread());
		System.out.println("-----------메인 종료-------------");
		
		Worker3 worker3 = new Worker3("워커3");
		worker3.start();
		
		Worker4 worker4 = new Worker4("워커4");
		worker4.start();
		
		
	} // end of main

} // end of class


class Worker3 extends Thread {
	
	private String name;
	
	public Worker3(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(name + ": " + i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
} // end of class

class Worker4 extends Thread {
	
	private String name;
	
	public Worker4(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		int i = 0;
		while(i < 10) {
			System.out.println(name + ": " + i);
			i++;
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
} // end of class