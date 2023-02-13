package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx2 extends JFrame {

	// 1 단계 JButton 2개 생성
	// 배치 관리자 FlowLayout 멤버 변수로 선언
	// 화면에 Component를 그려주세요.
	// 배열
	private JButton[] buttons;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private FlowLayout flowLayout;

	public FlowLayoutEx2() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("MyFrame");
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// for문
		button1 = new JButton("button1");
		button2 = new JButton("button2");
		flowLayout  = new FlowLayout(FlowLayout.RIGHT, 10, 10);
	}

	private void setInitLayout() {
		setLayout(flowLayout);
		// for문
		add(button1);
		add(button2);
	}
	
	public static void main(String[] args) {
		new FlowLayoutEx2();
	}

} // end of class
