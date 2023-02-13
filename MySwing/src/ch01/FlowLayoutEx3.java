package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx3 extends JFrame {

	// 멤버 변수 선언할 수 있는가
	// 배열을 활용할 수 있는가
	// 생성자 + 메서드 호출
	// for문 활용할 수 있는가
	// GUI프로그램 익숙해지기
	private JButton[] buttons;
	private FlowLayout flowLayout;

	public FlowLayoutEx3() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("Frame3");
		setSize(600, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// for문
		buttons = new JButton[8];
		for(int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("버튼" + (i + 1));
		}
		flowLayout  = new FlowLayout(FlowLayout.CENTER, 10, 10);
	}

	private void setInitLayout() {
		setLayout(flowLayout);
		// for문
		for(int i = 0; i < buttons.length; i++) {
			add(buttons[i]);
		}
	}
	
	public static void main(String[] args) {
		new FlowLayoutEx3();
	}

} // end of class
