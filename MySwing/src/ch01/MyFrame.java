package ch01;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	
	public MyFrame() {
		super.setTitle("MyFrame01");
		// width height
		super.setSize(200, 800);
		super.setVisible(true);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	// 코드 테스트
	public static void main(String[] args) {
		new MyFrame();
		// GUI 관련 프로그램 학습시에 배치 관리자 먼저 명확히 이해하는 것이 좋다.
		// 레이아웃 --> Button <-- 위치 설정해주는 녀석이 배치 관리자
	}
	
} // end of class
