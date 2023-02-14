package ch01;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx2 extends JFrame{
	// BorderLayout <- 컴포넌트들을 동 서 남 북 센터로 배치
	// 배열과 for문 활용해서 코드 수정
	
	// String[] direction = new String[5];
	// 변수 선언과 동시에 초기화 !!
	String[] direction = {BorderLayout.EAST, BorderLayout.WEST, 
			BorderLayout.SOUTH, BorderLayout.NORTH, BorderLayout.CENTER};
	String[] strings = {"동", "서", "남", "북", "센터"};
	JButton[] buttons = new JButton[5];
	
	public BorderLayoutEx2() {
		initData();
		setInitData();
	}
	
	private void initData() {
		setTitle("borderlayout 연습");
		setSize(600, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		for(int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(strings[i]);
		}
	}
	private void setInitData() {
//		setLayout();
		// borderLayout은 매개 변수값 하나를 더 추가 시킬 수 있다. (방향 지정 가능)
//		setLayout(new BorderLayoutEx1()); // 기본 레이아웃은 borderLayout이다.
		for(int i = 0; i < buttons.length; i++) {
			add(buttons[i], direction[i]);
		}
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new BorderLayoutEx2();
	} // end of main
	
	
	
	
} // end of class
